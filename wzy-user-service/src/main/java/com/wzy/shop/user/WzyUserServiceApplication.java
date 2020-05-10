package com.wzy.shop.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.wzy.shop.user.mapper")
public class WzyUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WzyUserServiceApplication.class, args);
    }

}
