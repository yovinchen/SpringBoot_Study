package com.yv.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yv.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author YoVinchen
 * @date 2023/3/14 下午 3:25
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
