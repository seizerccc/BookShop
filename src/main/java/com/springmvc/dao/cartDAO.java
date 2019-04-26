package com.springmvc.dao;

import com.springmvc.entity.Book;
import com.springmvc.entity.Cartitem;

import java.util.List;
import java.util.Map;

public interface cartDAO {
    //根据用户id生成购物车
    List<Cartitem> getCartById(int id);

    void insertToCart(Book book);
}
