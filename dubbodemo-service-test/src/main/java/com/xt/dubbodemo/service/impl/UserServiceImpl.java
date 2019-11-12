package com.xt.dubbodemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xt.dubbodemo.service.UserService;

/**
 * 服务提供方
 *
 * @Service : 使用 dubbo 提供的 service 注解，注册暴露服务
 */
@Service
public class UserServiceImpl implements UserService {

    public String getName() {
        return "dubbo demo service";
    }
}
