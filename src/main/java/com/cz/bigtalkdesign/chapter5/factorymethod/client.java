package com.cz.bigtalkdesign.chapter5.factorymethod;

/**
 * @ClassName: client
 * @date: 2019/7/4  15:19
 * @author: guohao
 * @Description:
 */
public class client {
    public static void main(String[] args) {
        LeiFengFactory fengFactory;
        fengFactory = new UndergraducateFactory();
        LeiFeng student = fengFactory.CreateLeiFeng();
        student.BuyRice();
        student.Sweep();
        student.Wash();

        fengFactory = new VolunteerFactory();
        LeiFeng volunteer = fengFactory.CreateLeiFeng();
        volunteer.BuyRice();
        volunteer.Sweep();
        volunteer.Wash();
    }
}
