package com.tyk.demo.advancedwire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: tyk
 * @Date: 2020/1/16 17:25
 * @Description:
 */
@Configuration
public class MagicConfig {
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        return new MagicBean();
    }
}
