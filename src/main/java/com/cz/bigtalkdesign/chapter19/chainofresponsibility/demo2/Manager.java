package com.cz.bigtalkdesign.chapter19.chainofresponsibility.demo2;

/**
 * @ClassName: Manager
 * @date: 2019/7/8  9:37
 * @author: guohao
 * @Description: 管理者
 */
public abstract class Manager {

    protected String name;
    protected Manager successor;

    public Manager(String name) {
        this.name = name;
    }

    /**
     * 设置下级
     * @param successor
     */
    public void setSuccessor(Manager successor) {
        this.successor = successor;
    }

    /**
     * 处理请求
     * @param request
     */
    public abstract void requestAppliacation(Request  request);
}
