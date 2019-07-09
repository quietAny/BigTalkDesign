package com.cz.bigtalkdesign.chapter1.simplefactory;

/**
 * @ClassName: OperationFactory
 * @date: 2019/7/4  10:36
 * @author: guohao
 * @Description:
 */
public class OperationFactory {

    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
        }
        return operation;
    }
}
