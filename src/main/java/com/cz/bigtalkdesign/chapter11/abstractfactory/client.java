package com.cz.bigtalkdesign.chapter11.abstractfactory;

/**
 * @ClassName: client
 * @date: 2019/7/5  10:02
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {

        Department department = new Department();
        User user = new User();

        IFactory accessFactory = new AccessFactory();
        IFactory sqlserverFactory = new SqlserverFactory();

        IUser iu = accessFactory.createUser();
        iu.intset(user);
        iu.getUser("1");

        IDepartment id = sqlserverFactory.createDepartment();
        id.insert(department);
        id.getDepartment(1);

    }
}
