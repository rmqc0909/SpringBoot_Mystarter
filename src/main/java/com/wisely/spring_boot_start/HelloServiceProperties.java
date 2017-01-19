package com.wisely.spring_boot_start;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by xiedan11 on 2017/1/18.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
