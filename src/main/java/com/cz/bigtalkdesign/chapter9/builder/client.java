package com.cz.bigtalkdesign.chapter9.builder;

/**
 * @ClassName: client
 * @date: 2019/7/4  16:57
 * @author: guohao
 * @Description:
 */
public class client {
    public static void main(String[] args) {

        Director director = new Director();

        Builder builder1 = new ConcreteBuilder1();
        director.construct(builder1);
        Product product1 = builder1.GetResult();
        product1.show();

        Builder builder2 = new ConcreteBuilder2();
        director.construct(builder2);
        Product product2 = builder2.GetResult();
        product2.show();
    }
}
