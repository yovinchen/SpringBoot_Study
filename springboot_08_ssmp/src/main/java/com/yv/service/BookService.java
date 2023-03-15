package com.yv.service;

import com.yv.admain.Book;

import java.util.List;

/**
 * @author YoVinchen
 * @date 2023/3/15 下午 10:39
 */
public interface BookService {
    /**
     * @param book
     * @return
     */
    Boolean save(Book book);

    /**
     * @param book
     * @return
     */
    Boolean update(Book book);

    /**
     * @param id
     * @return
     */
    Boolean delete(Integer id);

    /**
     * @param id
     * @return
     */
    Book getById(Integer id);

    /**
     * @return
     */
    List<Book> getAll();

}
