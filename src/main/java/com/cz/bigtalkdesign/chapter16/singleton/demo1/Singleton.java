package com.cz.bigtalkdesign.chapter16.singleton.demo1;

/**
 * @ClassName: Singleton
 * @date: 2019/7/5  15:55
 * @author: guohao
 * @Description: 懒汉式
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
