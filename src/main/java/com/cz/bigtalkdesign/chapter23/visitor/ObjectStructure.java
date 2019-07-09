package com.cz.bigtalkdesign.chapter23.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ObjectStructure
 * @date: 2019/7/8  14:16
 * @author: guohao
 * @Description: 对象结构
 */
public class ObjectStructure {

    private List<Person> elements = new ArrayList<Person>();

    /**
     * 增加
     * @param element
     */
    public void add(Person element){
        elements.add(element);
    }

    /**
     * 移除
     * @param element
     */
    public void delete(Person element){
        elements.remove(element);
    }

    /**
     * 查看显示
     * @param visitor
     */
    public void display(Action visitor){
        for (Person e: elements
             ) {
            e.accept(visitor);
        }
    }
}
