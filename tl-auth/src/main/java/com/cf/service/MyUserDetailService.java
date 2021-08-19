package com.cf.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author:chenf
 * @Date:2021/8/15 17:10
 * @describe
 */
@Service
public class MyUserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        // 查询获取数据库，即用户相关的信息
        return null;
    }
}
