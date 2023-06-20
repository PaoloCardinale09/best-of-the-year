package org.lessons.bestOfTheYear.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/") // rotta alla quale corrispondono i metodi di questo controller
public class IndexController {

    @GetMapping("/home")
    public String home(Model model) {
        String name = "Paolo";
       model.addAttribute("name", name);
    return "index"; // Ritorno il nome del template index.html resources/templates
    }


}
