package com.cz.bigtalkdesign.chapter13.adapter.demo2;

/**
 * @ClassName: Translator
 * @date: 2019/7/5  13:25
 * @author: guohao
 * @Description: 翻译着适配器
 */
public class Translator extends Player{

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void Attack() {
        foreignCenter.Attack();
    }

    @Override
    public void Defense() {
        foreignCenter.Defense();
    }
}
