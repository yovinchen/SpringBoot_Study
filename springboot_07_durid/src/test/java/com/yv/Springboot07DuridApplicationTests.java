package com.yv;

import com.yv.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot07DuridApplicationTests {

	@Autowired
	private BookDao bookDao;
	@Test
	void contextLoads() {
		System.out.println(bookDao.getById(1));
	}

}
