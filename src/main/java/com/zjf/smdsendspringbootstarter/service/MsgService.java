package com.zjf.smdsendspringbootstarter.service;

/**
 * @author zhaojufei
 */
public class MsgService {
    private String url;

    public MsgService(String url) {
        this.url = url;
    }

    public boolean sendMsg(String msg) {
        System.out.println(String.format("【信息:%s】，已发送至%s", msg, url));
        return true;
    }

}
