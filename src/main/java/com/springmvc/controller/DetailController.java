package com.springmvc.controller;

import com.springmvc.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class DetailController {
    @Autowired
    private bookService bookservice;

    @Autowired
    private HttpSession session;

    @GetMapping(value = "/detail")
    public String detailpage(Model model) {
        return "detail";
    }
}
