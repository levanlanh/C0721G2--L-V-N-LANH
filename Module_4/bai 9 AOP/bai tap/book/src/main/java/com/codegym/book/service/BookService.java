package com.codegym.book.service;



import com.codegym.book.model.Book;
import com.codegym.book.repository.IBookRepository;
import com.codegym.book.repository.ICardBorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService implements IBookService {
    @Autowired
    IBookRepository bookRepository;
    @Autowired
    ICardBorrowRepository cardBorrowRepository;


    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
   bookRepository.save(book);
    }

    @Override
    public List<Book> findByName(String name) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public Book findByIdDecrease(Integer id) {
        return null;
    }

    @Override
    public Book findByIdIncrease(Integer id) {
        return null;
    }

    @Override
    public Book returnBook(Book book, Integer id, Integer codeBorrow) {
        return null;
    }
}
