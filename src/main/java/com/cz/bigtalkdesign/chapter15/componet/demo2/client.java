package com.cz.bigtalkdesign.chapter15.componet.demo2;

/**
 * @ClassName: client
 * @date: 2019/7/5  15:31
 * @author: guohao
 * @Description:
 */
public class client {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany comp1 = new ConcreteCompany("上海华东公司");
        comp1.add(new HRDepartment("华东分公司人力资源部"));
        comp1.add(new FinanceDepartment("华东分公司财务部"));
        root.add(comp1);

        ConcreteCompany comp2 = new ConcreteCompany("南京办事处");
        comp2.add(new HRDepartment("南京分公司人力资源部"));
        comp2.add(new FinanceDepartment("南京分公司财务部"));
        root.add(comp2);

        ConcreteCompany comp3 = new ConcreteCompany("杭州办事处");
        comp3.add(new HRDepartment("杭州分公司人力资源部"));
        comp3.add(new FinanceDepartment("杭州分公司财务部"));
        root.add(comp3);

        System.out.println("\n结构图：");
        root.display(1);

        System.out.println("\n职责：");
        root.lineOfDuty();
    }
}
