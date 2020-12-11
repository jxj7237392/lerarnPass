package cn.jxj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: jxj
 * @Date: 2020/12/7 12:31
 */
@SpringBootApplication
@EnableEurekaClient
public class GoodsApplication {

    public static void main(String[] args) {

        SpringApplication.run(GoodsApplication.class, args);
    }
}
