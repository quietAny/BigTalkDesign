package com.cz.bigtalkdesign.chapter21.flyweight.demo1;

/**
 * @ClassName: UnsharedConcreteFlyweight
 * @date: 2019/7/8  11:11
 * @author: guohao
 * @Description: 不需要共享的flyweight子类
 */
public class UnsharedConcreteFlyweight extends Flyweight{

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体flyweight：" + extrinsicstate);
    }
}
