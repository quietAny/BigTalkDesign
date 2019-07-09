package com.cz.bigtalkdesign.chapter15.componet.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ConcreteCompany
 * @date: 2019/7/5  15:20
 * @author: guohao
 * @Description: 具体公司类
 */
public class ConcreteCompany extends Company{

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.getName());
        for (Company company : children) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : children) {
            company.lineOfDuty();
        }
    }
}
