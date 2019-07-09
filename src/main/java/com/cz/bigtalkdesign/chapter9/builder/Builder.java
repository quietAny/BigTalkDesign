package com.cz.bigtalkdesign.chapter9.builder;

/**
 * @ClassName: Builder
 * @date: 2019/7/4  16:51
 * @author: guohao
 * @Description: 抽象建造者类
 */
public abstract class Builder {

    public abstract void BuildPartA();
    public abstract void BuildPartB();
    public abstract Product GetResult();

}
