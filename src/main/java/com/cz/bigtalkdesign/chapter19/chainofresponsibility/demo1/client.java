package com.cz.bigtalkdesign.chapter19.chainofresponsibility.demo1;

/**
 * @ClassName: client
 * @date: 2019/7/8  9:32
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {

        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] result = {2,5,14,22,18,3,27,20};
        for (int request: result
             ) {
            h1.handleRequest(request);
        }

    }
}
