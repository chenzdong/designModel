package com.czd.module.prototype.example.shallow;

/**
 * 测试类
 *
 * @author: czd
 * @create: 2018/3/14 17:17
 */
public class Test1 {
    //浅复制
    public static void main(String[] args) {
        Resume1 a=new Resume1("a");
        a.setPersonalInfo("11", "male");
        a.setWorkExperience("a", "a");

        Resume1 b= a.clone();
        b.setWorkExperience("b","b");

        Resume1 c=a.clone();
        c.setWorkExperience("c", "c");

        a.display();
        b.display();
        c.display();

    }
}
