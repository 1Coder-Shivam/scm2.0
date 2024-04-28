package com.skm.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");
        model.addAttribute("name","Substring Technologies");
        model.addAttribute("YoutubeChannel","ShivamKrMaurya");
        model.addAttribute("Github","https://github.com/1Coder-Shivam/scm2.0");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(Model model){
        System.out.println("About page loading");
        return "about";
    }
    @RequestMapping("/services")
    public String servicesPage(Model model){
        System.out.println("Service page loading");
        return "services";
    }
}
