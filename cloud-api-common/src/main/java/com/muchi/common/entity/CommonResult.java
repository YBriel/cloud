package com.muchi.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * author: yuzq
 * create: 2020-04-08 10:48
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult {

    private Integer code;

    private String msg;

    private Object data;

    public CommonResult(Integer code, String msg){
        this(code,msg,null);
    }
}
