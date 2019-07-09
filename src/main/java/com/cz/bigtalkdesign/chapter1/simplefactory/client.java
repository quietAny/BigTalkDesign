package com.cz.bigtalkdesign.chapter1.simplefactory;

/**
 * @ClassName: client
 * @date: 2019/7/4  10:38
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {
        Operation operation;
        operation = OperationFactory.createOperate("+");
        operation.setNumberA(1);
        operation.setNumberB(2);
        System.out.println(operation.getResult());
        operation = OperationFactory.createOperate("-");
        operation.setNumberA(2);
        operation.setNumberB(1);
        System.out.println(operation.getResult());
        operation = OperationFactory.createOperate("*");
        operation.setNumberA(2);
        operation.setNumberB(3);
        System.out.println(operation.getResult());
        operation = OperationFactory.createOperate("/");
        operation.setNumberA(6);
        operation.setNumberB(2);
        System.out.println(operation.getResult());

    }
}
