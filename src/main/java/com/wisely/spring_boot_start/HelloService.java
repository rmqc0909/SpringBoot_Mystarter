package com.wisely.spring_boot_start;

/**
 * Created by xiedan11 on 2017/1/18.
 */
public class HelloService {
    private String msg;

    public String sayHi() {
        return "hihihi: " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
