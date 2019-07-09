package com.cz.bigtalkdesign.chapter3.decorate.demo2;

/**
 * @ClassName: Person
 * @date: 2019/7/4  14:17
 * @author: guohao
 * @Description:
 */
public class Person {

    private String name;

    public Person() {
    }


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的" + name);
    }
}
