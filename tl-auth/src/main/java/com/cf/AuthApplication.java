package com.cf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author:chenf
 * @Date:2021/8/14 16:17
 * @describe
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class,args);
    }
}
