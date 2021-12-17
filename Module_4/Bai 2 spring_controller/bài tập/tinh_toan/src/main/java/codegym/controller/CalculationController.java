package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculationController {
    @GetMapping("")
    public String show() {
        return "index";
    }

    @PostMapping("")
    public String Cal(Model model, @RequestParam(name = "num1") double num1
            ,@RequestParam(name = "num1") double num2,@RequestParam(name = "sign") char sign) {
        double result = 0;
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                break;
        }
        model.addAttribute("result", result);
        return "index";

    }

}
