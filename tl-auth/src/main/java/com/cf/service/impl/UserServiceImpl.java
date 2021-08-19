package com.cf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cf.entity.User;
import com.cf.mapper.UserMapper;
import com.cf.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author:chenf
 * @Date:2021/8/19 10:09
 * @describe
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
