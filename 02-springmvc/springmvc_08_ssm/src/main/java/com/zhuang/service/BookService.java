package com.zhuang.service;

import com.zhuang.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {

    /**
     * 保存
     *
     * @param book Book
     * @return boolean
     */
    boolean save(Book book);

    /**
     * 修改
     *
     * @param book Book
     * @return boolean
     */
    boolean update(Book book);

    /**
     * 按id删除
     *
     * @param id Integer
     * @return boolean
     */
    boolean delete(Integer id);

    /**
     * 按id查询
     *
     * @param id Integer
     * @return Book
     */
    Book getById(Integer id);

    /**
     * 查询全部
     *
     * @return List
     */
    List<Book> getAll();
}
