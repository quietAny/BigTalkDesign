package com.cz.bigtalkdesign.chapter16.singleton.demo1;

/**
 * @ClassName: client
 * @date: 2019/7/5  15:57
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1 == s2){
            System.out.println("两个对象是相同的实例");
        }
    }
}
