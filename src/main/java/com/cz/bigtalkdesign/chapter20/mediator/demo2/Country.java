package com.cz.bigtalkdesign.chapter20.mediator.demo2;

/**
 * @ClassName: Country
 * @date: 2019/7/8  10:25
 * @author: guohao
 * @Description: 国家类
 */
public abstract class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
