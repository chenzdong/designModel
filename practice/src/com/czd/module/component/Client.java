package com.czd.module.component;

/**
 * 调用者
 *
 * @author: czd
 * @create: 2018/7/26 10:44
 */
public class Client {
    public static void main(String[] args) {
        Composite component=new Composite("总公司");
        Leaf leaf=new Leaf("总公司部门");
        Composite composite1=new Composite("分公司");
        component.add(leaf);
        component.add(composite1);

        Leaf leaf1=new Leaf("分公司部门");
        Composite composite2=new Composite("分公司的分公司");
        composite1.add(leaf1);
        composite1.add(composite2);

        component.display();
    }
}
