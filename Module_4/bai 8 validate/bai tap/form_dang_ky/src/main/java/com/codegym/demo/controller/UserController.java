package com.codegym.demo.controller;

import com.codegym.demo.dto.FormDto;
import com.codegym.demo.model.User;
import com.codegym.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/create")
    public ModelAndView showRegisterForm(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("user", new FormDto());
        return modelAndView;
    }

    @PostMapping("/create")
    public String saveUser(@Valid @ModelAttribute("user") FormDto formDto, BindingResult bindingResult, Model model){
        new FormDto().validate(formDto,bindingResult);
        if(bindingResult.hasFieldErrors()){
            model.addAttribute("user",formDto);
            return "/create";
        }else {
            iUserService.save(formDto);
            model.addAttribute("message","Register successfully!");
            return "index";
        }
    }
}
