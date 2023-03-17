package com.yv.controller.utils;

import lombok.Data;

/**
 * @author YoVinchen
 * @date 2023/3/17 下午 8:49
 */
@Data
public class R {
    private Boolean flag;
    private Object data;

    public R(){};

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }
}
