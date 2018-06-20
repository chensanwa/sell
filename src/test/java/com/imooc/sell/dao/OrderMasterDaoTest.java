package com.imooc.sell.dao;

import com.fasterxml.jackson.datatype.jsr310.ser.YearSerializer;
import com.imooc.sell.entity.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA
 * Created By Mr.Chen
 * Date: 2018/6/20
 * Time: 20:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDaoTest {

    @Autowired
    private OrderMasterDao orderMasterDao;

    private final String OPENID = "110123";

    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("师兄");
        orderMaster.setBuyerPhone("123456789123");
        orderMaster.setBuyerAddress("幕课网");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(2.5));

        OrderMaster result = orderMasterDao.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() {

        PageRequest request = new PageRequest(1, 3);

        Page<OrderMaster> result = orderMasterDao.findByBuyerOpenid(OPENID, request);

        System.out.println(result.getTotalElements());

        Assert.assertNotEquals(0, result.getTotalElements());

    }
}