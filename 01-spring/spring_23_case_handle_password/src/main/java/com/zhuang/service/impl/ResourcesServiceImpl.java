package com.zhuang.service.impl;

import com.zhuang.dao.ResourcesDao;
import com.zhuang.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private ResourcesDao resourcesDao;

    public boolean openURL(String url, String password) {
        return resourcesDao.readResources(url, password);
    }
}
