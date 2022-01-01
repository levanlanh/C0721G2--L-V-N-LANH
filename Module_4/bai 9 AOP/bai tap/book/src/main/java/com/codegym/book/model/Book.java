package com.codegym.book.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    @Column(name = "number")
    private Integer number;

    @OneToMany( mappedBy = "book",cascade = CascadeType.REMOVE)
   private Set<CardBorrow> cardBorrowList;

    public Book(Integer id, String name, String author, Integer number, Set<CardBorrow> cardBorrowList) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.number = number;
        this.cardBorrowList = cardBorrowList;
    }

    public Book() {
    }

    public Book(Integer id, String name, String author, Integer number) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Set<CardBorrow> getCardBorrowList() {
        return cardBorrowList;
    }

    public void setCardBorrowList(Set<CardBorrow> cardBorrowList) {
        this.cardBorrowList = cardBorrowList;
    }
}
