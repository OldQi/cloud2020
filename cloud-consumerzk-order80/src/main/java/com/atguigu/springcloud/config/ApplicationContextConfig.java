package com.atguigu.springcloud.config;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced  //在配置类对应方法上添加@LoadBalanced注解，用于实现RestTemplate的负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
