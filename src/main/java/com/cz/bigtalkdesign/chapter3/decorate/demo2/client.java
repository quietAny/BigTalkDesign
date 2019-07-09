package com.cz.bigtalkdesign.chapter3.decorate.demo2;

/**
 * @ClassName: client
 * @date: 2019/7/4  14:25
 * @author: guohao
 * @Description:
 */
public class client {
    public static void main(String[] args) {
        Person person1 = new Person("小菜");
        Tshirt ts = new Tshirt();
        BigTrouser bt = new BigTrouser();

        ts.Decorate(person1);
        bt.Decorate(ts);
        bt.show();
    }
}
