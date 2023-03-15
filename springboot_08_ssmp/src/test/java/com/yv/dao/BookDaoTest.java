package com.yv.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yv.admain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author YoVinchen
 * @date 2023/3/15 下午 9:33
 */
@SpringBootTest
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave() {
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(14);
        book.setType("测试数据abcdefg");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(15);
    }

    @Test
    void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testGetPage() {
        IPage page = new Page(1, 5);
        bookDao.selectPage(page, null);
        //当前页
        System.out.println(page.getCurrent());
        //每页中数据数
        System.out.println(page.getSize());
        //总数据
        System.out.println(page.getTotal());
        //总页数
        System.out.println(page.getPages());
        //数据
        System.out.println(page.getRecords());
    }

    @Test
    void testGetBy() {
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name", "Spring");
        bookDao.selectList(qw);
    }

    @Test
    void testGetBy2() {
        String name = "Spring";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        //JDK17报错ew.sqlSegment != null，JDK1.8没有问题
        if (name != null) lqw.like(Book::getName, name);
        bookDao.selectList(lqw);
    }

    /**
     * 以Test3为标准
     */
    @Test
    void testGetBy3() {
        String name = null;
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        //JDK17报错ew.sqlSegment != null，JDK1.8没有问题
        lqw.like(name != null, Book::getName, name);
        bookDao.selectList(lqw);
    }
}
