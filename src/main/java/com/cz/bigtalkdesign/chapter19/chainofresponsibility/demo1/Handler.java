package com.cz.bigtalkdesign.chapter19.chainofresponsibility.demo1;

/**
 * @ClassName: Handler
 * @date: 2019/7/8  9:11
 * @author: guohao
 * @Description: 处理请求类
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求的抽象方法
     * @param request
     */
    public abstract void handleRequest(int request);
}
