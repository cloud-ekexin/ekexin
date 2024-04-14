package com.xiaofenhao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 库存模块启动类
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/5
 */
@SpringBootApplication
@MapperScan(basePackages = "com.xiaofenhao.**.dao")
@EnableTransactionManagement
public class InventoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }
}
