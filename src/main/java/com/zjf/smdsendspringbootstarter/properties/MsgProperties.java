package com.zjf.smdsendspringbootstarter.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhaojufei
 */
@Data
@ConfigurationProperties(prefix = "msg")
public class MsgProperties {

    /**
     * 访问发送短信的url地址
     */
    private String url;

}
