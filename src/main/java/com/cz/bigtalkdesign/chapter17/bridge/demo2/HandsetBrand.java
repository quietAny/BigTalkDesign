package com.cz.bigtalkdesign.chapter17.bridge.demo2;

/**
 * @ClassName: HandsetBrand
 * @date: 2019/7/5  16:44
 * @author: guohao
 * @Description: 手机品牌类
 */
public abstract class HandsetBrand {

    protected HandsetSoft handsetSoft;

    public void setHandsetSoft(HandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }

    public abstract void run();
}
