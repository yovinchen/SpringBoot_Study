package com.yv.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yv.admain.Goods;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author YoVinchen
 * @date 2023/5/10 19:08
 */
@Mapper
public interface GoodsDao extends BaseMapper<Goods> {
}
