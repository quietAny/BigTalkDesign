package com.cz.bigtalkdesign.chapter11.abstractfactory;

/**
 * @ClassName: SqlserverFactory
 * @date: 2019/7/5  9:56
 * @author: guohao
 * @Description:
 */
public class SqlserverFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
