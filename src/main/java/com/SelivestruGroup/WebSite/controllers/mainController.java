package com.SelivestruGroup.WebSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class mainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "MainPage");
        return "home";
    }

    @GetMapping("/aboutus")
    public String about(Model model) {
        model.addAttribute("title", "about us");
        return "about";
    }


    @GetMapping("/price")
    public String price(Model model) {
        model.addAttribute("title", "price");
        return "price";
    }


    @GetMapping("/smoon1")
    public String smoon1(Model model) {
        model.addAttribute("title", "smoon1");
        return "smoon1";
    }

    @GetMapping("/smoon2")
    public String smoon2(Model model) {
        model.addAttribute("title", "smoon2");
        return "smoon2";
    }

    @GetMapping("/smoon3")
    public String smoon3(Model model) {
        model.addAttribute("title", "smoon3");
        return "smoon3";
    }
}