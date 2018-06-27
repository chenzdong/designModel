package com.czd.module.prototype.example.common;

import com.czd.module.prototype.example.common.Resume;

/**
 * 测试类
 *
 * @author: czd
 * @create: 2018/3/14 17:17
 */
public class Test {
    public static void main(String[] args) {
        Resume a=new Resume("a");
        a.setPersonalInfo("11", "male");
        a.setWorkExperience("1998-1998", "a company");

        Resume b= a.clone();
        b.setWorkExperience("1188","b c");

        Resume c=a.clone();
        c.setPersonalInfo("1","2");

        a.display();
        b.display();
        c.display();

    }
}
