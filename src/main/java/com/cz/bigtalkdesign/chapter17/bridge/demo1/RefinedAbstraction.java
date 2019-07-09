package com.cz.bigtalkdesign.chapter17.bridge.demo1;

/**
 * @ClassName: RefinedAbstraction
 * @date: 2019/7/5  16:32
 * @author: guohao
 * @Description:
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void Operation() {
        implementor.Operation();
    }
}
