package com.springmvc.service.impl;

import com.springmvc.dao.bookDAO;
import com.springmvc.entity.Book;
import com.springmvc.service.bookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("bookService")
public class bookServiceImpl implements bookService {
    @Resource
    private bookDAO bookDao;

    public Book selectBookByName(String bookname) {
        return  bookDao.selectBookByName(bookname);
    }
}
