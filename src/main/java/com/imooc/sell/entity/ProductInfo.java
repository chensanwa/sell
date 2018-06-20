package com.imooc.sell.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/6/20
 * Time: 18:59
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    private String productName;     //商品名称

    private BigDecimal productPrice;

    private Integer productStock;       //库存

    private String productDescription;

    private String productIcon;     //小图

    private Integer productStatus;      //状态 0正常 1下架

    private Integer categoryType;       //类目编号

}
