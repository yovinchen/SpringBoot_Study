package com.yv.dao.impl;

import com.yv.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author YoVinchen
 * @date 2023/3/9 下午 2:31
 */

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao is running ....");
    }
}
