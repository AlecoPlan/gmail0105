package com.wzy.shopuser;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.wzy.shopuser.mapper")
public class WzyShopUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(WzyShopUserApplication.class, args);
    }

}
