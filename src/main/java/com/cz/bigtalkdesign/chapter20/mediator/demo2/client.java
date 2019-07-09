package com.cz.bigtalkdesign.chapter20.mediator.demo2;

/**
 * @ClassName: client
 * @date: 2019/7/8  10:37
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {

        UnitedNationsSecurityCouncil u =  new UnitedNationsSecurityCouncil();

        USA usa = new USA(u);
        Iraq iraq = new Iraq(u);

        u.setColleague1(usa);
        u.setColleague2(iraq);

        usa.send("不准研制核武器，否则要发动战争！");
        iraq.send("我们没有核武器，也不怕侵略。");
    }
}
