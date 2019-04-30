package com.czd.module.singleton;

import com.czd.module.singleton.enumSingleton.EnumSingleton;
import com.czd.module.singleton.enumSingleton.MyEnum;

/**
 * 测试单例模式
 *
 * @author: czd
 * @create: 2018/6/27 11:35
 */
public class Test {
    public static void main(String[] args) {


        EnumSingleton upperSingleton1= MyEnum.INSTANCE.getInstance();
        EnumSingleton upperSingleton2=MyEnum.INSTANCE.getInstance();
        System.out.println(upperSingleton1.equals(upperSingleton2));
    }

}
