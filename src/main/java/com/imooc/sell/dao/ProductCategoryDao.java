package com.imooc.sell.dao;

import com.imooc.sell.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/6/20
 * Time: 11:46
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {
}
