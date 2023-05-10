package com.yv.service;

import com.yv.admain.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author YoVinchen
 * @date 2023/5/10 19:54
 */
@SpringBootTest
public class GoodsServiceTest {

    @Autowired
    private GoodsService goodsService;

    @Test
    void testGetAll(){
        List<Goods> list = goodsService.list();
        System.out.println(list.toString());
    }
}
