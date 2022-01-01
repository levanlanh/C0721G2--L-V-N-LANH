package com.codegym.book.controller;

import com.codegym.book.model.Book;
import com.codegym.book.model.CardBorrow;
import com.codegym.book.service.IBookService;
import com.codegym.book.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("book")

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

    @GetMapping("{id}/view")
    public String view(@PathVariable("id") Integer id,Model model) throws Exception{
        Book book = bookService.findById(id);
        if(book == null){
            throw new Exception();
        };
        model.addAttribute("book",book);
        return "book/view";
    }
    @GetMapping("{id}/delete")
    public String showDelete(@PathVariable("id") Integer id ,Model model){
        model.addAttribute("book",bookService.findById(id));
        return "book/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute("book") Book book, RedirectAttributes redirectAttributes){
        bookService.remove(book.getId());
        redirectAttributes.addFlashAttribute("message","Removed product successfully!");
        return "redirect:/book/book" ;
    }
    @GetMapping("/search")
    public String search(@RequestParam(name = "name") String name, Model model) throws Exception {
        List<Book> bookList = bookService.findByName(name);
        if (bookList == null) {
            throw new Exception();
        }
        model.addAttribute("bookList", bookList);
        return "book/search";
    }
    @GetMapping("/borrow")
    public String borrow(@RequestParam(name="id") Integer id,Model model) throws Exception{
        Book book = bookService.findByIdDecrease(id);
        bookService.save(book);
        CardBorrow cardBorrow = cardService.randomBorrowCode(book);
        List<Book> bookList = bookService.getAll();
        if(bookList == null|| book.getNumber()<0){
            throw new Exception();
        }
        model.addAttribute("bookList",bookList);
        model.addAttribute("cardborrow",cardBorrow.getCode());
        return "book/index";
    }

    @GetMapping("/return")
    public String returnBook1(@RequestParam(name = "id") Integer id,Model model){
        Book book = bookService.findById(id);
        model.addAttribute("book",book);
        return "book/give_book_back";
    }
    @PostMapping("/return")
    public String returnConfirm(@ModelAttribute(name = "book") Book book,
                                @RequestParam(name = "id") Integer id,
                                @RequestParam(name = "codeBorrow") Integer codeBorrow,
                                Model model) throws Exception{
        Book book1 = bookService.returnBook(book,id,codeBorrow);
        if(book1 == null){
            throw new Exception();
        }
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        model.addAttribute("bookList",bookList);
        return "book/index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("book",new Book());
        model.addAttribute("cardBorrowList",cardService.getAll());
        return "book/create";
    }
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("book") Book book, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) throws Exception {

        if (bindingResult.hasErrors()) {
            model.addAttribute("cardBorrowList", cardService.getAll());
            return "/book/create";

        }
        if (book == null) {
            throw new Exception();
        }
        redirectAttributes.addFlashAttribute("message", "Create success");
        bookService.save(book);
        return "redirect:/book/book";
    }


//    @ExceptionHandler(Exception.class)
//    public String handleException() {
//        return "/book/exception";
//    }

}
