package com.yv.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yv.admain.Book;
import com.yv.dao.BookDao;
import com.yv.service.IBookService;
import org.springframework.stereotype.Service;

/**
 * @author YoVinchen
 * @date 2023/3/17 上午 11:13
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
}
