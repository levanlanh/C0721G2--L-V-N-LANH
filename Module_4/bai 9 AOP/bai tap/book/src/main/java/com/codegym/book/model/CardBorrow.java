package com.codegym.book.model;



import javax.persistence.*;

@Entity(name = "card_borrow")
public class CardBorrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_card")
    private Integer id;
    @Column(name = "code")
    private Integer code;

    @ManyToOne()
    @JoinColumn(name = "id")
    private Book book;


    public CardBorrow() {
    }

    public CardBorrow(Integer id, Integer code) {
        this.id = id;
        this.code = code;
    }

    public CardBorrow(Integer id, Integer code, Book book) {
        this.id = id;
        this.code = code;
        this.book = book;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
