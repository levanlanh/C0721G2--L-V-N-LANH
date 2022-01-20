package com.casetudy.controller;

import com.casetudy.model.customer.Customer;
import com.casetudy.model.customer.CustomerType;
import com.casetudy.service.customer.ICustomerService;
import com.casetudy.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @ModelAttribute
    public Iterable<CustomerType> customerTypes() {
        return customerTypeService.findAll();
    }

    @GetMapping("")
    public String showListPage(Model model, @RequestParam(value = "page", defaultValue = "0") int page) {
        Page<Customer> customerPage = customerService.findAll(PageRequest.of(page, 3));
        model.addAttribute("customers", customerPage);
        return "customer/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        String[] genderList ={"Male","Female"};
        model.addAttribute("customer", new Customer());
        model.addAttribute("genderList",genderList);
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        return "customer/create";
    }

    @PostMapping("/save")
    public String createCustomer(@Valid  @ModelAttribute("customer") Customer customer, BindingResult bindingResult,Model model) {
        if(bindingResult.hasErrors()){
            String[]genderList={"Male", "Female"};
            model.addAttribute("genderList", genderList);
            model.addAttribute("customerTypeList", customerTypeService.findAll());
            return "customer/create";
        }
        this.customerService.save(customer);
        return "redirect:/customer/";
    }


    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable Integer id, Model model) {
        String[] genderList ={"Male","Female"};
        model.addAttribute("genderList",genderList);
        model.addAttribute("customer", customerService.findById(id));
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        return "customer/edit";
    }

    @PostMapping("/edit")
    public String edit(@Valid @ModelAttribute("customer") Customer customer,BindingResult bindingResult,Model model) {
        if(bindingResult.hasErrors()){
            String[]genderList={"Male", "Female"};
            model.addAttribute("genderList", genderList);
            model.addAttribute("customerTypeList", customerTypeService.findAll());
            return "customer/edit";
        }
        this.customerService.save(customer);
        return "redirect:/customer/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam Integer id) {
       customerService.remove(id);
        return "redirect:/customer/";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable("id") Integer id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "customer/view";
    }
    @GetMapping("/search")
    public String search(@RequestParam(name = "search") String name, Model model){
        List<Customer> customerList = customerService.findByName(name);
        model.addAttribute("customerList",customerList);
        return "customer/search";
    }

}
