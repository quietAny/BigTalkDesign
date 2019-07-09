package com.cz.bigtalkdesign.chapter9.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Product
 * @date: 2019/7/4  16:48
 * @author: guohao
 * @Description: 产品类
 */
public class Product {

    List<String> parts = new ArrayList<String>();

    /**
     * 添加部件
     * @param part
     */
    public void add(String part){
        parts.add(part);
    }

    /**
     * 列举所有部件
     */
    public void show(){
        System.out.println("产品构建------");
        for (String part : parts) {
            System.out.println(part);
        }
    }

}
