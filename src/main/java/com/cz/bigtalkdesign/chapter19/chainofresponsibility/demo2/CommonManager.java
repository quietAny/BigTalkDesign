package com.cz.bigtalkdesign.chapter19.chainofresponsibility.demo2;

/**
 * @ClassName: CommonManager
 * @date: 2019/7/8  9:44
 * @author: guohao
 * @Description: 经理类
 */
public class CommonManager extends Manager{

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestAppliacation(Request request) {
        if(request.getType() =="请假" && request.getNum() <= 2){
            System.out.println(name + ":" + request.getContext() + "数量" + request.getNum() + "被批准");
        }
        else {
            if(successor != null){
                successor.requestAppliacation(request);
            }
        }
    }
}
