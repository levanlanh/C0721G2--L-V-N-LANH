package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping("")
    public String show() {
        return "sandwich";
    }

    @PostMapping("/finish")
    public String save(@RequestParam(name = "spice") String[] spicelist, Model model) {
        model.addAttribute("spicelist", spicelist);
        return "finish_sandwich";
    }
}
