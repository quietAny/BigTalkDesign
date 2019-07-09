package com.cz.bigtalkdesign.chapter8.facade;

/**
 * @ClassName: Facade
 * @date: 2019/7/4  16:38
 * @author: guohao
 * @Description:
 */
public class Facade {

    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;

    public Facade() {
        one = new SubSystemOne();
        two =  new SubSystemTwo();
        three = new SubSystemThree();
    }

    public void methodA(){
        System.out.println("方法组A");
        one.methodOne();
        three.methodThree();
    }

    public void methodB(){
        System.out.println("方法组B");
        two.methodTwo();
        three.methodThree();
    }
}
