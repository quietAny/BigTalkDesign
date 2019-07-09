package com.cz.bigtalkdesign.chapter15.componet.demo2;

/**
 * @ClassName: FinanceDepartment
 * @date: 2019/7/5  15:29
 * @author: guohao
 * @Description:
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
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
        System.out.println(this.getName() + " 公司财务收支管理");
    }
}
