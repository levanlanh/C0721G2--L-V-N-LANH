package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @GetMapping("/blog")
    public String listBlog(Model model){
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("blog",blogs);
        return "list";
    }
}
