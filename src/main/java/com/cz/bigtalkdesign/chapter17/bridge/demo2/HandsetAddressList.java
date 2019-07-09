package com.cz.bigtalkdesign.chapter17.bridge.demo2;

/**
 * @ClassName: HandsetAddressList
 * @date: 2019/7/5  16:43
 * @author: guohao
 * @Description:
 */
public class HandsetAddressList implements HandsetSoft{
    @Override
    public void run() {
        System.out.println("运行手机通讯录");
    }
}
