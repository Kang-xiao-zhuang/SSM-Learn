package com.zhuang.factory;

import com.zhuang.dao.OrderDao;
import com.zhuang.dao.impl.OrderDaoImpl;

//静态工厂创建对象
public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("factory setup....");
        return new OrderDaoImpl();
    }
}
