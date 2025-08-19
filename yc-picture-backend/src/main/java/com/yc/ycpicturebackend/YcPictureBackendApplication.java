package com.yc.ycpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yc.ycpicturebackend.mapper")
public class YcPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YcPictureBackendApplication.class, args);
    }

}
