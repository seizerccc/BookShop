package com.springmvc.service;

import com.springmvc.entity.Book;
import com.springmvc.entity.Cartitem;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface cartService {
    //根据用户id生成购物车
    public List<Cartitem> getCartById(int id);

    public void insertToCart(Book book);
}
