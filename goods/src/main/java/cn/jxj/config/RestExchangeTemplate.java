package cn.jxj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: jxj
 * @Date: 2020/12/14 14:30
 */
@Configuration
public class RestExchangeTemplate {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
