package com.ranyk.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SsmApplication 项目启动类
 *
 * @author ranYk
 * @version V1.0
 * @date 2022-06-25
 */
@SpringBootApplication
@MapperScan("com.ranyk.ssm.mapper")
public class SsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmApplication.class, args);
    }

}
