package com.codegym.gio_hang.controller;
import com.codegym.gio_hang.model.Cart;
import com.codegym.gio_hang.model.Product;
import com.codegym.gio_hang.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class ShoppingCartController {

    @Autowired
    IProductService iProductService;

    @ModelAttribute("cart")
    public Cart setupCart(){
        return new Cart();
    }

    @GetMapping("/shopping-cart")
    public ModelAndView showCart (@SessionAttribute("cart") Cart cart){
        ModelAndView modelAndView = new ModelAndView("/cart");
        modelAndView.addObject("cart",cart);
        return modelAndView;
    }
    public String view(@RequestParam("id") Long id, Model model){
        Optional<Product> product = iProductService.findById(id);
        model.addAttribute("product",product);
        return "view";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id, @SessionAttribute("cart") Cart cart, RedirectAttributes redirectAttributes) {
        Product productOptional = iProductService.findId(id);
        cart.deleteProduct(productOptional);
        redirectAttributes.addFlashAttribute("message", "Removed product successfully!");
        return "redirect:/shopping-cart";
    }
}
