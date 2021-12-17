package controllerMonney;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MonneyController {
    @GetMapping("")
    public String showGet(){
        return "index";
    }

    @PostMapping("")
    public String showPost(Model model, @RequestParam double usd, @RequestParam double vnd){
        double change = vnd * usd ;
        model.addAttribute("ketqua",change);
        return "index";
    }
}
