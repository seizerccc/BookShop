package com.springmvc.controller;

import com.springmvc.entity.Book;
import com.springmvc.entity.Customer;
import com.springmvc.service.bookService;
import com.springmvc.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
public class BooksController {

    @Autowired
    private bookService bookservice;

    @Autowired
    private HttpSession session;

    @GetMapping(value = "/books")
    public String bookspage(Model model) {
        return "books";
    }



    @PostMapping(value = "/books")
    @ResponseBody
    public Object login(@RequestParam(required = false, value = "bookname") String bookname,
                        HttpSession session)
    {


        //根据登入名字判断此用户是否存在
        Book book = bookservice.selectBookByName(bookname);

        if(book == null)
        {
            Integer i =0;//读取书本信息失败
            return i;
        }
        else
        {
            session.setAttribute("currBook",book);
            Integer i =1;
            return i;
        }
    }
}
