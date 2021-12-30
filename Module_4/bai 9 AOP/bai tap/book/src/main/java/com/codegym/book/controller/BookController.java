package com.codegym.book.controller;

import com.codegym.book.model.Book;
import com.codegym.book.service.IBookService;
import com.codegym.book.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private ICardService cardService;

    @GetMapping({"","/book"})
    public String showListBook(Model model) {
        List<Book> bookList = bookService.getAll();
        model.addAttribute("bookList", bookList);
        return "book/index";
    }

}
