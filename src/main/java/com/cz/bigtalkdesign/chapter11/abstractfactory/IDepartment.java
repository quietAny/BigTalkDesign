package com.cz.bigtalkdesign.chapter11.abstractfactory;

/**
 * @ClassName: IDepartment
 * @date: 2019/7/5  9:47
 * @author: guohao
 * @Description:
 */
public interface IDepartment {

    void insert(Department  department);
    Department getDepartment(int id);
}
