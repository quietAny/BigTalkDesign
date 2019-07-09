package com.cz.bigtalkdesign.chapter10.Observer;

/**
 * @ClassName: StockObserver
 * @date: 2019/7/4  17:59
 * @author: guohao
 * @Description: 员工类
 */
public class NBAObserver implements Observer {

    private String name;
    private Observable sub;

    public NBAObserver(String name, Observable sub) {
        this.name = name;
        this.sub = sub;
    }

    @Override
    public void update() {
        System.out.println(sub.subjectState(name) + "关闭NBA，继续工作！");
    }
}
