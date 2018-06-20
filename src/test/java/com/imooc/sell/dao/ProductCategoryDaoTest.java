package com.imooc.sell.dao;

import com.imooc.sell.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/6/20
 * Time: 11:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    @Transactional
    public void findOneTest(){
        ProductCategory productCategory = productCategoryDao.getOne(1);
        System.out.println("---------------------------------");
        System.out.println(productCategory);
        System.out.println("---------------------------------");
    }


}
