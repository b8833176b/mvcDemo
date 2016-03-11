package com.gyw.dao.user;

import com.gyw.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/9.
 */
@Transactional
public class UserDaoImpl implements UserDao {
    @Resource
    private SessionFactory sessionFactory;
    /*@Resource
    private HibernateTemplate hibernateTemplate;*/

    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public List<User> queryAll(){
        System.out.println("query all user sucess...");
        List<User> userList = new ArrayList<User>();
        Session session = null;
        try
        {
            session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            String hql="from com.gyw.model.User";
            Query query = session.createQuery(hql);
            userList= query.list();
            /*String hql = "from User";
            userList = (List<User>) this.getHibernateTemplate().find(hql);*/
            /*Query query = session.createQuery("from User");
            userList = query.list();*/
            session.getTransaction().commit();
        }
        catch (Exception e)
        {
            if (session != null) {
                session.getTransaction().rollback();
            }
        }

        finally
        {
            if (session != null) {
                session.close();
            }
        }
        return userList;
    }

    public void addUser(User user){
        System.out.println("add user"+user.getName()+" :sucess...");
    }

    public void updateUser(User user){
        System.out.println("update user"+user.getName()+":sucess...");
    }

}
