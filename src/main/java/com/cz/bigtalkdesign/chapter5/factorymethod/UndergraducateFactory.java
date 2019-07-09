package com.cz.bigtalkdesign.chapter5.factorymethod;

/**
 * @ClassName: UndergraducateFactory
 * @date: 2019/7/4  15:17
 * @author: guohao
 * @Description:
 */
public class UndergraducateFactory implements LeiFengFactory {
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Undergraducate();
    }
}
