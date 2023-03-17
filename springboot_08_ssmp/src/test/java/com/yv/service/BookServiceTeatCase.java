package com.yv.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yv.admain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author YoVinchen
 * @date 2023/3/17 上午 10:58
 */
@SpringBootTest
public class BookServiceTeatCase {


    @Autowired
    private BookService bookService;

    @Test
    void testGetById(){
        System.out.println(bookService.getById(4));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.save(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(15);
        book.setType("测试数据abcdefg");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookService.update(book);
    }

    @Test
    void testDelete(){
        bookService.delete(15);
    }

    @Test
    void testGetAll(){
        bookService.getAll();
    }

    @Test
    void testGetPage(){
        IPage<Book> page = bookService.getPage(2, 5);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());
    }

}
