package com.springmvc.dao;

import com.springmvc.entity.Book;

public interface bookDAO {
    Book selectBookByName(String bookname);
}
