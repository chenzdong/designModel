package com.czd.module.prototype.example.deep;

/**
 * 测试类
 *
 * @author: czd
 * @create: 2018/3/14 17:17
 */
public class Test2 {
    //深复制
    public static void main(String[] args) {
        Resume2 a=new Resume2("a");
        a.setPersonalInfo("11", "male");
        a.setWorkExperience("a", "a");

        Resume2 b= a.clone();
        b.setWorkExperience("b","b");

        Resume2 c=a.clone();
        c.setWorkExperience("c", "c");

        a.display();
        b.display();
        c.display();

    }
}
