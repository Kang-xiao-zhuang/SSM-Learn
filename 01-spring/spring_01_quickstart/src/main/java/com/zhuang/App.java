package com.zhuang;

import com.zhuang.service.BookService;
import com.zhuang.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
