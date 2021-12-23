package com.example.blog.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class ECommerce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameECommerce;

    @OneToMany(mappedBy = "eCommerce")
    List<Blog> blogs;

    public ECommerce(int id, String nameECommerce) {
        this.id = id;
        this.nameECommerce = nameECommerce;
    }

    public ECommerce() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameECommerce() {
        return nameECommerce;
    }

    public void setNameECommerce(String nameECommerce) {
        this.nameECommerce = nameECommerce;
    }
}
