package com.cz.bigtalkdesign.chapter3.decorate.demo2;

/**
 * @ClassName: Tshirt
 * @date: 2019/7/4  14:22
 * @author: guohao
 * @Description:
 */
public class Tshirt extends Decorator {

    @Override
    public void show() {
        super.show();
        System.out.println("大体恤");
    }
}
