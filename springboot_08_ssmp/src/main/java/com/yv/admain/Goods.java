package com.yv.admain;

import lombok.Data;

/**
 * @author YoVinchen
 * @date 2023/5/10 19:03
 */
@Data
public class Goods {
    private int id;
    private String goods_name;
    private String goods_img;
    private int goods_price;
    private int goods_count;
    private Boolean goods_state;

}

