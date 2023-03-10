package com.yv;

import com.yv.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @RunWith(设置运行器)
 * @ContextConfiguration(classes)
 */
@SpringBootTest
class Springboot04JunitApplicationTests {

    //1.注入你要测试的对象
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        //2.执行要测试的对象对应的方法
        bookDao.save();
    }

}
