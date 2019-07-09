package com.cz.bigtalkdesign.chapter4.proxy;

/**
 * @ClassName: Pursuit
 * @date: 2019/7/4  14:55
 * @author: guohao
 * @Description: 追求者
 */
public class Pursuit implements GiveGift {

    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void GiveDolls() {
        System.out.println(mm.getName() + "送你洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(mm.getName() + "送你鲜花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(mm.getName() + "送你巧克力");
    }
}
