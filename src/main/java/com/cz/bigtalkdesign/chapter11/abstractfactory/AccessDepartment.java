package com.cz.bigtalkdesign.chapter11.abstractfactory;

/**
 * @ClassName: SqlserverDepartment
 * @date: 2019/7/5  9:52
 * @author: guohao
 * @Description:
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在access中给department表添加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在access中通过id获得department表的一条记录");
        return null;
    }
}
