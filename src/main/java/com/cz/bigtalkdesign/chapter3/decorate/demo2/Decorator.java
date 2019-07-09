package com.cz.bigtalkdesign.chapter3.decorate.demo2;

/**
 * @ClassName: Decorator
 * @date: 2019/7/4  14:20
 * @author: guohao
 * @Description:
 */
public class Decorator extends Person {

    protected Person person;

    public void Decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
       if(person != null){
           person.show();
       }
    }
}
