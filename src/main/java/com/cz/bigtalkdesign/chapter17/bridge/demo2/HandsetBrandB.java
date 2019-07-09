package com.cz.bigtalkdesign.chapter17.bridge.demo2;

/**
 * @ClassName: HandsetBrandA
 * @date: 2019/7/5  16:45
 * @author: guohao
 * @Description: 手机品牌类B
 */
public class HandsetBrandB extends HandsetBrand{
    @Override
    public void run() {
        handsetSoft.run();
    }
}
