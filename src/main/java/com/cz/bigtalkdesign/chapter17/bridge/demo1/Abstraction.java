package com.cz.bigtalkdesign.chapter17.bridge.demo1;

/**
 * @ClassName: Abstraction
 * @date: 2019/7/5  16:29
 * @author: guohao
 * @Description:
 */
public class Abstraction {

    protected Implementor implementor;


    public void Operation(){
        implementor.Operation();
    }

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
}
