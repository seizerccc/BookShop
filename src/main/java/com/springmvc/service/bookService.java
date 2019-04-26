package com.springmvc.service;

import com.springmvc.entity.Book;

public interface bookService {

    Book selectBookByName(String bookname);

}
