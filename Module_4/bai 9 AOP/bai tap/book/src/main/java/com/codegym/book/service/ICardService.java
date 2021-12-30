package com.codegym.book.service;

import com.codegym.book.model.Book;
import com.codegym.book.model.CardBorrow;

import java.util.List;


public interface ICardService {
    List<CardBorrow> getAll();

    CardBorrow findById(Integer id);

    void save(CardBorrow cardBorrow);


    CardBorrow randomBorrowCode(Book book);

    List<CardBorrow> findByName(String name);

    void remove(Integer id);
}