package com.cz.bigtalkdesign.chapter9.builder;

/**
 * @ClassName: ConcreteBuilder1
 * @date: 2019/7/4  16:54
 * @author: guohao
 * @Description:
 */
public class ConcreteBuilder2 extends Builder {

    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.add("部件X");
    }

    @Override
    public void BuildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product GetResult() {
        return product;
    }
}
