package com.cz.bigtalkdesign.chapter14.memorandum.demo1;

/**
 * @ClassName: client
 * @date: 2019/7/5  14:00
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();

        Caretaker c = new Caretaker();
        c.setMemento(o.createMemento());

        o.setState("Off");
        o.show();

        o.setMemento(c.getMemento());
        o.show();

    }



}
