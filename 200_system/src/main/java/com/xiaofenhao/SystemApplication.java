package com.xiaofenhao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * SpringBoot启动程序
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/4
 */
@SpringBootApplication
@MapperScan(basePackages = "com.xiaofenhao.**.dao")
@EnableTransactionManagement
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }
}
