package com.cz.bigtalkdesign.chapter6.prototype.demo2;

/**
 * @ClassName: client
 * @date: 2019/7/4  15:48
 * @author: guohao
 * @Description:
 */
public class client {
    public static void main(String[] args) {
        Resume a = new Resume("小菜");
        a.setPersonalInfof("男","21");
        a.setWorkExperience("2017-2018","xx公司");

        Resume b = (Resume)a.clone();
        b.setPersonalInfof("男","24");

        Resume c = (Resume)a.clone();
        c.setWorkExperience("2012-2019","yy公司");

        a.disPlay();
        b.disPlay();
        c.disPlay();
    }
}
