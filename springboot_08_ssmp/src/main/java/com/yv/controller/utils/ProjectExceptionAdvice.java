package com.yv.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * springMVC的异常处理器
 *
 * @author YoVinchen
 * @date 2023/3/22 上午 11:22
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    /**
     * 拦截所有异常
     */
    @ExceptionHandler
    public R doException(Exception ex) {
        //记录日志

        // 通知运营

        // 通知开发
        ex.printStackTrace();
        return new R("服务器故障，请稍后再试！");
    }

}
