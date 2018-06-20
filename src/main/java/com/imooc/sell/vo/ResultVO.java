package com.imooc.sell.vo;

import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/6/20
 * Time: 19:36
 */
@Data
public class ResultVO<T> {

    private Integer code;       //错误码

    private String msg;     //提示信息

    private T data;     //内容

}
