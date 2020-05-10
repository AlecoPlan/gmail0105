package com.wzy.shop.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.wzy.shop.manage.mapper")
public class WzyManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WzyManageServiceApplication.class, args);
    }

}
