package com.cf.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:chenf
 * @Date:2021/8/19 10:04
 * @describe
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String userName;
    private String password;

}
