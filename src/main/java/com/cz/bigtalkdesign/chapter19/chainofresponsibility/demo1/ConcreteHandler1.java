package com.cz.bigtalkdesign.chapter19.chainofresponsibility.demo1;

/**
 * @ClassName: ConcreteHandler1
 * @date: 2019/7/8  9:14
 * @author: guohao
 * @Description:
 */
public class ConcreteHandler1 extends Handler{

    @Override
    public void handleRequest(int request) {
        if(request >= 0 && request < 10){
            System.out.println(this.getClass().getName() + "处理请求" + request);
        }
        else {
            successor.handleRequest(request);
        }
    }
}
