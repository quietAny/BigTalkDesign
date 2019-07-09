package com.cz.bigtalkdesign.chapter19.chainofresponsibility.demo2;

/**
 * @ClassName: Majordemo
 * @date: 2019/7/8  9:47
 * @author: guohao
 * @Description: 总经理
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestAppliacation(Request request) {
        if(request.getType() =="请假"){
            System.out.println(name + ":" + request.getContext() + "数量" + request.getNum() + "被批准");
        }
        else if(request.getType() == "加薪" && request.getNum() <= 500){
            System.out.println(name + ":" + request.getContext() + "数量" + request.getNum() + "被批准");
        }
        else if(request.getType() == "加薪" && request.getNum() > 500){
            System.out.println(name + ":" + request.getContext() + "数量" + request.getNum() + "再说吧");
        }
    }
}
