package com.springmvc.controller;


import com.springmvc.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @Autowired
    private customerService custService;

    @Autowired
    private HttpSession session;

    @GetMapping(value = "/home")
    public String homepage(Model model) {
        return "home";
    }
}
