package com.springmvc.service.impl;

import com.springmvc.dao.cartDAO;
import com.springmvc.entity.Cartitem;
import com.springmvc.service.cartService;
import org.apache.ibatis.annotations.MapKey;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("cartService")
public class cartServiceImpl implements cartService {

    @Resource
    private cartDAO cartDao;//dao层处理类，自动寻找bean注入


    //Map<Integer,Employee>:键是这条记录的主键，值是记录封装后的javaBean
    //@MapKey:告诉mybatis封装这个map的时候使用哪个属性作为map的key
    @MapKey("bookname")
    public List<Cartitem> getCartById(int id){
        List<Cartitem> cart = cartDao.getCartById(id);
        return cart;
    }

}
