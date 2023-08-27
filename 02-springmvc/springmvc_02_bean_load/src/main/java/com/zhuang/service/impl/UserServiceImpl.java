package com.zhuang.service.impl;

import com.zhuang.domain.User;
import com.zhuang.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public void save(User user) {
        System.out.println("user service ...");
    }
}
