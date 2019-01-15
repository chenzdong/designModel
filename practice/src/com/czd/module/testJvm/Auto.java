package com.czd.module.testJvm;

import java.util.Arrays;
import java.util.List;

/**
 * 自动装箱、拆箱
 *
 * @author: czd
 * @create: 2018/9/5 14:13
 */
public class Auto {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        // true -128--127都是引用常量池 为同一个对象
        System.out.println(c == d);
        //false 超过128
        System.out.println(e == f);
        //true 加号自动拆箱为值
        System.out.println(c == (a+b));
        //true localInteger3.equals(Integer.valueOf(localInteger1.intValue() + localInteger2.intValue()))
        System.out.println(c.equals(a+b));
        //true 加号自动拆箱为值
        System.out.println(g == (a+b));
        //false localLong.equals(Integer.valueOf(localInteger1.intValue() + localInteger2.intValue()))
        System.out.println(g.equals(a+b));

        String h = "a";
        String z = "a";
        String i = "ac";
        String m = "c";
        String j = z+m;
        //true
        System.out.println(h == z);
        //true
        System.out.println(h.equals(z));
        //false
        System.out.println(j == i);
        //true
        System.out.println(j.equals(i));
    }

}
