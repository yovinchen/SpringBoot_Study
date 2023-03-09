package com.yv.dao;

import com.yv.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author YoVinchen
 * @date 2023/3/9 下午 3:25
 */
@Mapper
public interface BookDao {
    /**
     * @param id
     * @return
     */
    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);
}
