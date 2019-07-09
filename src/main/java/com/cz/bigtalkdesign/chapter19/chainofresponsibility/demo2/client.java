package com.cz.bigtalkdesign.chapter19.chainofresponsibility.demo2;

/**
 * @ClassName: client
 * @date: 2019/7/8  9:51
 * @author: guohao
 * @Description:
 */
public class client {
    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager("金利");
        Majordemo majordemo = new Majordemo("宗剑");
        GeneralManager generalManager = new GeneralManager("钟经历");

        commonManager.setSuccessor(majordemo);
        majordemo.setSuccessor(generalManager);

        Request request1 = new Request();
        request1.setType("请假");
        request1.setContext("小菜请假");
        request1.setNum(1);
        commonManager.requestAppliacation(request1);

        Request request2 = new Request();
        request2.setType("请假");
        request2.setContext("小菜请假");
        request2.setNum(4);
        commonManager.requestAppliacation(request2);

        Request request3 = new Request();
        request3.setType("加薪");
        request3.setContext("小菜加薪");
        request3.setNum(500);
        commonManager.requestAppliacation(request3);

        Request request4 = new Request();
        request4.setType("加薪");
        request4.setContext("小菜加薪");
        request4.setNum(1000);
        commonManager.requestAppliacation(request4);
    }
}
