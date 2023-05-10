package com.yv.controller;

import com.yv.controller.utils.R;
import com.yv.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YoVinchen
 * @date 2023/5/10 19:45
 */

@RestController
@CrossOrigin
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping
    public R getAll() {
        return new R(true,goodsService.list());
    }
}
