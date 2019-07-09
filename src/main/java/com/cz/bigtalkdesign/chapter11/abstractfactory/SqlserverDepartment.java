package com.cz.bigtalkdesign.chapter11.abstractfactory;

/**
 * @ClassName: SqlserverDepartment
 * @date: 2019/7/5  9:52
 * @author: guohao
 * @Description:
 */
public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在sqlserver中给department表添加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在sqlserver中通过id获得department表的一条记录");
        return null;
    }
}
