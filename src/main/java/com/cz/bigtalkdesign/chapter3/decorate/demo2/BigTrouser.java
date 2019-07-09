package com.cz.bigtalkdesign.chapter3.decorate.demo2;

/**
 * @ClassName: BigTrouser
 * @date: 2019/7/4  14:24
 * @author: guohao
 * @Description:
 */
public class BigTrouser extends Decorator {

    @Override
    public void show() {
        super.show();
        System.out.println("垮裤");
    }
}
