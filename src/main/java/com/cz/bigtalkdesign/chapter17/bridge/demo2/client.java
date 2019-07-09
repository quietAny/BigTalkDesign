package com.cz.bigtalkdesign.chapter17.bridge.demo2;

/**
 * @ClassName: client
 * @date: 2019/7/5  16:49
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {
        HandsetBrand ab;
        ab = new HandsetBrandA();

        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

        ab = new HandsetBrandB();

        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();
    }

}
