package com.springmvc.controller;


import com.springmvc.entity.Cartitem;
import com.springmvc.entity.Customer;
import com.springmvc.service.cartService;
import com.springmvc.service.customerService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebResult;
import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private customerService custService; //自动寻找合适的service的bean并注入
    @Autowired
    private cartService cartservice;


    @GetMapping(value = "/login")
    public String getLoginPage(Model model){
        return "/login";
    }

    private HttpServletRequest request;

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
            Integer i =0;//读取用户信息失败
            return i;
        }
        else
        {
            if(customer.getPassword().equals(password))
            {
                session.setAttribute("currCustomer",customer);
                //List<Cartitem> cart= cartservice.getCartById(customer.getCustid());
                //session.setAttribute("currCart",cart);

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
