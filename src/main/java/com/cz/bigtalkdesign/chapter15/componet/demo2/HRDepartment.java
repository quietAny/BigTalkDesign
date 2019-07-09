package com.cz.bigtalkdesign.chapter15.componet.demo2;

/**
 * @ClassName: HRDepartment
 * @date: 2019/7/5  15:27
 * @author: guohao
 * @Description: 人力资源部门
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.getName());
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.getName() + "  员工招聘培训管理");
    }
}
