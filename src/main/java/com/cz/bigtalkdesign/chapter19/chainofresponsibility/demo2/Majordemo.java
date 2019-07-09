package com.cz.bigtalkdesign.chapter19.chainofresponsibility.demo2;

/**
 * @ClassName: Majordemo
 * @date: 2019/7/8  9:47
 * @author: guohao
 * @Description: 总监类
 */
public class Majordemo extends Manager {

    public Majordemo(String name) {
        super(name);
    }

    @Override
    public void requestAppliacation(Request request) {
        if(request.getType() =="请假" && request.getNum() <= 5){
            System.out.println(name + ":" + request.getContext() + "数量" + request.getNum() + "被批准");
        }
        else {
            if(successor != null){
                successor.requestAppliacation(request);
            }
        }
    }
}
