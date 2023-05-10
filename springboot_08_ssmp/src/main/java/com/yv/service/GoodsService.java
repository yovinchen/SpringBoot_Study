package com.yv.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yv.admain.Goods;

/**
 * @author YoVinchen
 * @date 2023/5/10 19:09
 */
public interface GoodsService extends IService<Goods> {
    boolean saveGoods(Goods goods);

    boolean modify(Goods goods);

    boolean delete(Integer id);


}
