package com.cz.bigtalkdesign.chapter9.builder;

/**
 * @ClassName: Director
 * @date: 2019/7/4  16:56
 * @author: guohao
 * @Description: 指挥者类
 */
public class Director {

    public void construct(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
    }
}
