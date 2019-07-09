package com.cz.bigtalkdesign.chapter16.singleton.demo2;


/**
 * @ClassName: Singleton
 * @date: 2019/7/5  15:59
 * @author: guohao
 * @Description: 多线程下的单例模式:双重检查锁
 */
public class Singleton {

    private static Singleton instacne;

    private Singleton() {
    }

    public static Singleton getInstacne(){
        if(instacne == null){
            synchronized (Singleton.class){
                if(instacne == null){
                    instacne = new Singleton();
                }
            }
        }

        return instacne;
    }
}
