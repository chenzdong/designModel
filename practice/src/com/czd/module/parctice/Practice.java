package com.czd.module.parctice;

/**
 * 测试
 *
 * @author: czd
 * @create: 2018/3/14 11:18
 */
public class Practice {
    public static void main(String[] args) {
        Worker a=new Worker("a");
        a.setAge("11");
        a.setSex("male");
        Worker b=a ;
        b.setName("d");
        Worker c=a ;
        System.out.println(a.equals(b));
        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
    }

}
