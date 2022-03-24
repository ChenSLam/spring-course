package com.bjpowernode;

import static org.junit.Assert.assertTrue;

import com.bjpowernode.service.BuyGoodsService;
import com.bjpowernode.service.impl.BuyGoodsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        BuyGoodsService buyGoodsService = (BuyGoodsService) ctx.getBean("buyService");
        //调用方法
        buyGoodsService.buy(1002,10);
    }
}
