package com.cz.bigtalkdesign.chapter20.mediator.demo2;

/**
 * @ClassName: UnitedNationsSecurityCouncil
 * @date: 2019/7/8  10:33
 * @author: guohao
 * @Description:
 */
public class UnitedNationsSecurityCouncil extends UnitedNations{

    private USA colleague1;
    private Iraq colleague2;

    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void declare(String message, Country country) {
        if (country == colleague1){
            colleague1.getMessage(message);
        }
        else if(country == colleague2){
            colleague2.getMessage(message);
        }
    }
}
