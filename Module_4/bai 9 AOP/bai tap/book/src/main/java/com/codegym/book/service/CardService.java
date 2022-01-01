package com.codegym.book.service;

import com.codegym.book.model.Book;
import com.codegym.book.model.CardBorrow;
import com.codegym.book.repository.IBookRepository;
import com.codegym.book.repository.ICardBorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CardService implements ICardService {
    @Autowired
    ICardBorrowRepository cardBorrowRepository;
    @Autowired
    IBookRepository bookRepository;

    @Override
    public List<CardBorrow> getAll() {
        return cardBorrowRepository.findAll();
    }

    @Override
    public CardBorrow findById(Integer id) {
        return cardBorrowRepository.findById(id).orElse(null);
    }

    @Override
    public void save(CardBorrow cardBorrow) {
    cardBorrowRepository.save(cardBorrow);
    }

    @Override
    public CardBorrow randomBorrowCode(Book book) {
        CardBorrow cardBorrow = new CardBorrow();
        int ramDom = (int) (Math.random()*10000);
        cardBorrow.setCode(ramDom);
        cardBorrow.setId(book.getId());
        CardBorrow cardBorrow1 = cardBorrowRepository.save(cardBorrow);
        return cardBorrow1;
    }

    @Override
    public List<CardBorrow> findByName(String name) {
        return null;
    }

    @Override
    public void remove(Integer id) {

    }
}
