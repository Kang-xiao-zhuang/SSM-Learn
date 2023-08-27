package com.zhuang.factory;

import com.zhuang.dao.UserDao;
import com.zhuang.dao.impl.UserDaoImpl;

//实例工厂创建对象
public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
