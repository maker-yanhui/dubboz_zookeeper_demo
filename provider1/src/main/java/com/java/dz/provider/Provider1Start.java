package com.java.dz.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description:
 * author:严辉(小辉)
 * time:16:40
 */
@SpringBootApplication
@MapperScan("com.java.dz.provider.mapper")
public class Provider1Start {
    public static void main(String[] args) {
        SpringApplication.run(Provider1Start.class);
    }
}
