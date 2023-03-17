package com.yv.admain;

import lombok.Data;

/**
 * @author YoVinchen
 * @date 2023/3/15 下午 9:24
 *
 * lombok
 */
@Data
public class Book {
    private int id;
    private String type;
    private String name;
    private String description;
}
