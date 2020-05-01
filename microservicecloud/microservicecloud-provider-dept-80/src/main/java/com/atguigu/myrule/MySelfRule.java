package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
       // return new RandomRule();  //Ribbon默认是轮询，我定义为随机
       return new RandomRule_LW();  //我定义每台机器五次
    }
}