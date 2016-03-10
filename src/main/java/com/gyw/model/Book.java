package com.gyw.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_book")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    public Book(){}
    public Book(int id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

}
