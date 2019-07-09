package com.cz.bigtalkdesign.chapter2.strategic;

/**
 * @ClassName: ConcreteStrategyA
 * @date: 2019/7/4  13:39
 * @author: guohao
 * @Description: 具体算法A
 */
public class ConcreteStrategyA extends Strategy{


    @Override
    public void AlgorithmInterface() {
        System.out.println("实现a算法");
    }
}
