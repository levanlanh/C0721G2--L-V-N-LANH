package com.codegym.book.repository;

import com.codegym.book.model.CardBorrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICardBorrowRepository extends JpaRepository<CardBorrow, Integer > {
}