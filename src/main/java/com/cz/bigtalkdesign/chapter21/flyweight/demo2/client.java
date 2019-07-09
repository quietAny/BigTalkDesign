package com.cz.bigtalkdesign.chapter21.flyweight.demo2;

/**
 * @ClassName: client
 * @date: 2019/7/8  13:14
 * @author: guohao
 * @Description: 客户端
 */
public class client {

    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();

        Website fx = factory.getWebsiteCategory("产品展示");
        fx.Use(new User("小菜"));

        Website fy = factory.getWebsiteCategory("产品展示");
        fy.Use(new User("大鸟"));

        Website fz = factory.getWebsiteCategory("产品展示");
        fz.Use(new User("娇娇"));

        Website fl = factory.getWebsiteCategory("博客");
        fl.Use(new User("老顽童"));

        Website fm = factory.getWebsiteCategory("博客");
        fm.Use(new User("桃谷六仙"));

        Website fn = factory.getWebsiteCategory("博客");
        fn.Use(new User("南海鳄神"));

        System.out.println("得到的网站分类总数" + factory.getWebsiteCount());
    }
}
