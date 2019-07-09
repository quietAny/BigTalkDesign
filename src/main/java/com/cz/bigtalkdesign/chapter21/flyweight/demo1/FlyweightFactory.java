package com.cz.bigtalkdesign.chapter21.flyweight.demo1;


import java.util.Hashtable;

/**
 * @ClassName: FlyweightFactory
 * @date: 2019/7/8  11:13
 * @author: guohao
 * @Description: 享元工厂
 */
public class FlyweightFactory {

    private Hashtable flyweights = new Hashtable();


    public FlyweightFactory() {
        flyweights.put("X",new ConcreteFlyweight());
        flyweights.put("Y",new ConcreteFlyweight());
        flyweights.put("Z",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
      return ((Flyweight)flyweights.get(key));
    }
}
