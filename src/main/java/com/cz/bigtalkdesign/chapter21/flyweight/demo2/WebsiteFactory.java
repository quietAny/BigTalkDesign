package com.cz.bigtalkdesign.chapter21.flyweight.demo2;

import java.util.Hashtable;

/**
 * @ClassName: WebsiteFactory
 * @date: 2019/7/8  13:10
 * @author: guohao
 * @Description: 网站工厂类
 */
public class WebsiteFactory {

    private Hashtable flyweights = new Hashtable();

    /**
     * 获得网站分类
     * @param key
     * @return
     */
    public Website getWebsiteCategory(String key){
        if(!flyweights.containsKey(key)){
            flyweights.put(key,new ConcreteWebsite(key));
        }
        return (Website)flyweights.get(key);
    }

    /**
     * 获得网站的分类总数
     * @return
     */
    public int getWebsiteCount(){
        return flyweights.size();
    }
}
