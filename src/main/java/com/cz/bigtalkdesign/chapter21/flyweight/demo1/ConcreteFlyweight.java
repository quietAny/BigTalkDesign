package com.cz.bigtalkdesign.chapter21.flyweight.demo1;

/**
 * @ClassName: ConcreteFlyweigth
 * @date: 2019/7/8  11:08
 * @author: guohao
 * @Description:
 */
public class ConcreteFlyweight extends Flyweight{
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight：" + extrinsicstate);
    }
}
