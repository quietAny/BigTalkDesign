package com.cz.bigtalkdesign.chapter10.Observer;

/**
 * @ClassName: client
 * @date: 2019/7/5  9:16
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {
        Boss hu = new Boss();

        StockObserver tongshi1 = new StockObserver("魏冠朝",hu);

        NBAObserver tongshi2 = new NBAObserver("管易查",hu);

        hu.addObserver(tongshi1);
        hu.addObserver(tongshi2);
        hu.removeObserver(tongshi1);

        hu.subjectState("我胡汉三回来了！");
        hu.notifyObserver();

    }
}
