package com.cz.bigtalkdesign.chapter11.abstractfactory;

/**
 * @ClassName: SqlserverFactory
 * @date: 2019/7/5  9:56
 * @author: guohao
 * @Description:
 */
public class AccessFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
