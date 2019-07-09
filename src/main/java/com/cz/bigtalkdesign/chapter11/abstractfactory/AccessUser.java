package com.cz.bigtalkdesign.chapter11.abstractfactory;

/**
 * @ClassName: SqlserverDepartment
 * @date: 2019/7/5  9:52
 * @author: guohao
 * @Description:
 */
public class AccessUser implements IUser {

    @Override
    public void intset(User user) {
        System.out.println("在access中给user表添加一条记录");
    }

    @Override
    public User getUser(String id) {
        System.out.println("在access中通过id在user表中查询一条记录");
        return null;
    }
}
