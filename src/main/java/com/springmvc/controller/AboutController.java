package com.springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AboutController {

    @Autowired
    private HttpSession session;

    @GetMapping(value = "/about")
    public String aboutpage(Model model) {
        return "about";
    }
}
