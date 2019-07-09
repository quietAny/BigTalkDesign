package com.cz.bigtalkdesign.chapter13.adapter.demo1;

/**
 * @ClassName: Adapter
 * @date: 2019/7/5  13:08
 * @author: guohao
 * @Description:
 */
public class Adapter extends Target{

    private Adaptee adaptee = new Adaptee();

    @Override
    public void Request() {
        adaptee.SpecificRequest();
    }
}
