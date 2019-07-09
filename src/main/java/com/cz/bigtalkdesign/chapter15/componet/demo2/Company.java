package com.cz.bigtalkdesign.chapter15.componet.demo2;

/**
 * @ClassName: Company
 * @date: 2019/7/5  15:16
 * @author: guohao
 * @Description: 公司
 */
public abstract class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 添加
     * @param company
     */
    public abstract void add(Company company);

    /**
     * 移除
     * @param company
     */
    public abstract void remove(Company company);

    /**
     * 显示
     * @param depth
     */
    public abstract void display(int depth);

    /**
     * 履行职责
     */
    public abstract void lineOfDuty();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
