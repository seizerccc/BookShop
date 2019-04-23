package com.springmvc.dao;

import com.springmvc.entity.Customer;
import org.apache.ibatis.annotations.Param;

public interface customerDAO {
    //插入用户信息
    void insertCust(@Param("customer")Customer customer);

    //删除用户信息
    void deleteCust(int id);

    //更新用户信息
    void updateCust(@Param("customer_1")Customer customer);

    //根据昵称获取用户信息
    Customer selectCustByName(String name);
}
