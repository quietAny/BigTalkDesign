package com.cz.bigtalkdesign.chapter11.abstractfactory;

/**
 * @ClassName: IFactory
 * @date: 2019/7/5  9:54
 * @author: guohao
 * @Description:
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
