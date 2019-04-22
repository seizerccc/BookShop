package com.springmvc.service.impl;


import com.springmvc.dao.customerDAO;
import com.springmvc.entity.Customer;
import com.springmvc.service.customerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("customerService")//声明以下类作为Service注入
public class customerServiceImpl implements customerService {

    @Resource
    private customerDAO customerDao;//dao层处理类，自动寻找bean注入

    public void insertCust(Customer customer){
        customerDao.insertCust(customer);
    }

    public void deleteCust(int id){

    }

    public void updateCust(Customer customer) {
        customerDao.updateCust(customer);
    }

    public Customer selectCustById(int id){
        return customerDao.selectCustById(id);
    }
}
