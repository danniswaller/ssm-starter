package com.github.danniswaller.ssmstarter.controller;
import com.github.danniswaller.ssmstarter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * Created by danniswalle on 2018/8/20.
 */

@Controller public class NavigationController {


    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String toDefaultPage() {
        return "redirect:/home";
    }


    @GetMapping("/home")
    public String toHomePage(Model model) {
        model.addAttribute("users", userService.findAllUsers());

        return "home";
    }

    @GetMapping("/login")
    public String toLoginPage() {
        return "login";
    }
}
