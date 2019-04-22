package com.springmvc.service;

import com.springmvc.entity.Customer;


public interface customerService {

    //插入用户信息
    void insertCust(Customer customer);

    //删除用户信息
    void deleteCust(int id);

    //更新用户信息
    void updateCust(Customer customer);

    //根据昵称获取用户信息
    Customer selectCustById(int id);
}
