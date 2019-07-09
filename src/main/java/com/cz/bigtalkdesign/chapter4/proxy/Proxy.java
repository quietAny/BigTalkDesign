package com.cz.bigtalkdesign.chapter4.proxy;

/**
 * @ClassName: Proxy
 * @date: 2019/7/4  14:57
 * @author: guohao
 * @Description:
 */
public class Proxy implements GiveGift {

    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }

    @Override
    public void GiveDolls() {
        gg.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        gg.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        gg.GiveChocolate();
    }
}
