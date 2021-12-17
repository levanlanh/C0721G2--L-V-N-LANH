package controllerTuDien;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.TreeMap;

@Controller
public class TuDienController {
    @GetMapping("")
    public String showGet() {
        return "index";
    }

    @PostMapping
    public String showPost(Model model, @RequestParam String words) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("hello", "xinh chào");
        map.put("love", "yêu");
        map.put("book", "vở");
      String r = map.get(words);
           if(r != null){
               model.addAttribute("dich",r);
               return "index";
           }else {
               model.addAttribute("message","not found");
               return "index";
           }
    }
}
