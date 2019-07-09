package com.cz.bigtalkdesign.chapter21.flyweight.demo1;

/**
 * @ClassName: Client
 * @date: 2019/7/8  11:21
 * @author: guohao
 * @Description:
 */
public class Client {

    public static void main(String[] args) {

        int extrinsicstate = 22;
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight fx = factory.getFlyweight("X");
        fx.operation(--extrinsicstate);

        Flyweight fy = factory.getFlyweight("Y");
        fy.operation(--extrinsicstate);

        Flyweight fz = factory.getFlyweight("Z");
        fz.operation(--extrinsicstate);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicstate);
    }
}
