package com.springmvc.controller;


import com.springmvc.entity.Customer;
import com.springmvc.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebResult;
import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private customerService custService; //自动寻找合适的service的bean（UserInfoServiceImpl）并注入

    @GetMapping(value = "/login")
    public String getLoginPage(Model model){
        return "/login";
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public Object login(@RequestParam(required = false, value = "nickName") String nickname,
                        @RequestParam(required = false, value = "password") String password,
                        HttpSession session)
    {


        //根据登入名字判断此用户是否存在
         Customer customer = custService.selectCustByName(nickname);

        if(customer == null)
        {
            Integer i =0;
            return i;
        }
        else
        {
            if(customer.getPassword().equals(password))
            {
                /*model.addAttribute("userInfo",user);*/
                session.setAttribute("currCustomer",customer);
                Integer i=1;
                return i;
            }
            else
            {
                Integer i=0;
                return i;
            }
        }
    }
}
