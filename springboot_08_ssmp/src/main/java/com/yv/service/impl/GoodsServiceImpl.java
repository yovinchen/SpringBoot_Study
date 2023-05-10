package com.yv.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yv.admain.Goods;
import com.yv.dao.GoodsDao;
import com.yv.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author YoVinchen
 * @date 2023/5/10 19:15
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsDao, Goods> implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public boolean saveGoods(Goods goods) {
        return goodsDao.insert(goods) > 0;
    }

    @Override
    public boolean modify(Goods goods) {
        return goodsDao.updateById(goods) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return goodsDao.deleteById(id) > 0;
    }


}
