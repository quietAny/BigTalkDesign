package com.cz.bigtalkdesign.chapter7.template;

/**
 * @ClassName: AbstractClass
 * @date: 2019/7/4  16:26
 * @author: guohao
 * @Description:
 */
public abstract class AbstractClass {

    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void TemplateMethond(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("");
    }
}
