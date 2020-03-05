package com.zjf.smdsendspringbootstarter.configuration;

import com.zjf.smdsendspringbootstarter.properties.MsgProperties;
import com.zjf.smdsendspringbootstarter.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaojufei
 */
@Configuration
@ConditionalOnClass(MsgService.class)
@EnableConfigurationProperties(MsgProperties.class)
public class MsgAutoConfiguration {

    @Autowired
    private MsgProperties msgProperties;

    @Bean
    @ConditionalOnMissingBean(MsgService.class)
    public MsgService msgService() {
        MsgService msgService = new MsgService(msgProperties.getUrl());
        // 如果提供了其他set方法，在此也可以调用对应方法对其进行相应的设置或初始化。
        return msgService;
    }

}
