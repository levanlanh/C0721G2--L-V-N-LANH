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
import org.springframework.web.bind.annotation.*;


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
        Page<Customer> customerPage = customerService.findAll(PageRequest.of(page, 5));
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
    public String createCustomer(@ModelAttribute("customer") Customer customer) {
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
    public String edit(@ModelAttribute("customer") Customer customer) {
        this.customerService.save(customer);
        return "redirect:/customer/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "customer/delete";
    }

    @PostMapping("/delete")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer) {
        System.out.println(customer.getId());
        customerService.remove(customer.getId());
        return "redirect:/customer/";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable("id") Integer id, Model model) {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        return "customer/view";
    }


}
