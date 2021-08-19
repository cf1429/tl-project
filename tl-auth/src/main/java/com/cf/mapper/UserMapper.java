package com.cf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cf.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author:chenf
 * @Date:2021/8/19 9:55
 * @describe
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
