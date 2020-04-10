package com.casestudy.casestudy.Controller;


//import com.casestudy.casestudy.Entity.Contact;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")

    public String layout() {
        return "layout";
    }

//    @GetMapping("/add")
//    public String add(Model model) {
////        model.addAttribute("contact", new Contact());
//        return "form";
//    }
    @GetMapping("/register")
    public String register() {
        return "RegisterAndLogin";
    }
    @PostMapping("/register")
    public String doRegister() {
        System.out.printf("AAAAAAAAAAAAAAAa");
        return "layout";
    }
}



