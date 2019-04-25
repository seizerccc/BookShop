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

import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
public class RegisterController {
    @Autowired
    private customerService custService;

    @Autowired
    private HttpSession session;

    @GetMapping(value = "/register")
    public String registerpage(Model model) {
        return "/register";
    }

    @PostMapping(value = "/register")
    @ResponseBody
    public Object login(@RequestParam(required = false, value = "realname") String realname,
                        @RequestParam(required = false, value = "nickname") String nickname,
                        @RequestParam(required = false, value = "password") String password,
                        @RequestParam(required = false, value = "phone") String phone,
                        HttpSession session)
    {
        //设置随机ID和返回消息
        Integer i =0;
        Random rand = new Random();
        int id = rand.nextInt(100000)+1;

        //检测密码长度
        if(password.length()>6){
            i=1;
            return i;
        }
        else{
            Customer newCust = new Customer();
            newCust.setCustid(id);
            newCust.setCustname(realname);
            newCust.setNickname(nickname);
            newCust.setPhone(phone);
            newCust.setPassword(password);
            try{
                custService.insertCust(newCust);
            }catch (Exception e){
                i=2;
                return i;
            }


            return  i;
        }



    }
}
