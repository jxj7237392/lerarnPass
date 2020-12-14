package cn.jxj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: jxj
 * @Date: 2020/12/7 12:31
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan("cn.jxj.dao")
public class OrderApplication {

    public static void main(String[] args) {

        SpringApplication.run(OrderApplication.class, args);
    }
}
