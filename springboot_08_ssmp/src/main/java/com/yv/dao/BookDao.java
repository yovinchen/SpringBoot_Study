package com.yv.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yv.admain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author YoVinchen
 * @date 2023/3/15 下午 9:31
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
