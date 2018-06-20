package com.imooc.sell.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/6/20
 * Time: 11:34
 */
@Table(name = "product_category")   //标注表名称
@Entity
@Data       //lombok插件，托管getter,setter,toString
@DynamicUpdate      //动态更新，（使用MySQL的时间）
public class ProductCategory {

    @Id     //主键
    @GeneratedValue     //自增类型
    private Integer categoryId;
    private String categoryName;    //类目名称
    private Integer categoryType;   //编号
    private Date createTime;
    private Date updateTime;

}
