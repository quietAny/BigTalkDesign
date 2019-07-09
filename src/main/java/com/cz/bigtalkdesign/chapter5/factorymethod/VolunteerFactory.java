package com.cz.bigtalkdesign.chapter5.factorymethod;

/**
 * @ClassName: VolunteerFactory
 * @date: 2019/7/4  15:18
 * @author: guohao
 * @Description:
 */
public class VolunteerFactory implements LeiFengFactory {
    @Override
    public LeiFeng CreateLeiFeng() {
        return new Volunteer();
    }
}
