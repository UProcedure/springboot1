package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qq166
 */
@SpringBootApplication
@MapperScan("com.qf.mapper")
public class Springboot1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1Application.class, args);
    }

}
