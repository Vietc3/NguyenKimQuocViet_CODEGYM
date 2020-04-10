package com.crud.crudcustomer.controller;

import com.crud.crudcustomer.Models.User;
import com.crud.crudcustomer.Models.userDAO;
import com.crud.crudcustomer.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class userController {

    @Autowired
    userService userService;

    @GetMapping("/")
    public String addOrEdit(ModelMap model) {
        User u = new User();
//        u.setUserName("Việt Đại Ca");
        model.addAttribute("USER", u);
        model.addAttribute("ACTION", "saveOrUpdate");

        return "register-user";
    }

    @PostMapping("/saveOrUpdate")
    public String saveOrUpdate(ModelMap model, @ModelAttribute("USER") User user) {
//        userDAO dao = new userDAO();
//        dao.save(user);
//        System.out.println("size" + dao.getAll().size());
        userService.save(user);
        return "register-user";

    }

    @RequestMapping("/list")
    public String list(ModelMap model) {
//        userDAO dao = new userDAO();
//        model.addAttribute("USER", dao.getAll());
        model.addAttribute("USER", userService.findAll());
        return "view-user";
    }

    @RequestMapping("/edit/{username}")

    public String edit(ModelMap model,
                       @PathVariable(name = "username") String username) {
//        userDAO dao = new userDAO();
//        User u = dao.findByUsername(username);
        Optional<User> u = userService.findById(username);
        if (u.isPresent()) {
            model.addAttribute("USER", u.get());
        } else {
            model.addAttribute("USER", new User());
        }
        model.addAttribute("USER", u);
        model.addAttribute("ACTION", "/saveOrUpdate");
        return "register-user";
    }


    @RequestMapping("/delete/{username}")

    public String delete(ModelMap model,
                         @PathVariable(name = "username") String username) {
//        userDAO dao = new userDAO();
//        dao.delete(username);
        userService.deleteById(username);
        model.addAttribute("USER", userService.findAll());
        return "view-user";
    }

}
