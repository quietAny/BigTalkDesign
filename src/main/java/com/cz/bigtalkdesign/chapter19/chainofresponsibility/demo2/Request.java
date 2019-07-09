package com.cz.bigtalkdesign.chapter19.chainofresponsibility.demo2;

/**
 * @ClassName: Request
 * @date: 2019/7/8  9:41
 * @author: guohao
 * @Description: 请求类
 */
public class Request {

    private String context;
    private String type;
    private int num;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
