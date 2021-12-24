package com.controller;


import com.model.Blog;
import com.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    @GetMapping("create")
    public String showCreate(Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }

    public String saveForm(@ModelAttribute("blog") Blog blog,Model model){
        blogService.save(blog);
        model.addAttribute("blog",new Blog());
        model.addAttribute("msg","Created new blog");
        return "create";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        blogService.remove(blog.getId());
        return ("redirect:/blog");
    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable("id") Integer id, Model model) {
        Blog blog = blogService.findById(id);
        model.addAttribute("blog", blog);
        return "edit";
    }

    @PostMapping("edit")
    public String update(@ModelAttribute("blog") Blog blog, Model model) {
        blogService.save(blog);
        model.addAttribute("blog", blog);
        return ("redirect:/blog");
    }
}
