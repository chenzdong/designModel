package com.czd.module.testJvm;

import java.util.HashMap;
import java.util.Map;

/**
 * 泛型类
 * @author: czd
 * @create: 2018/9/5 13:57
 */
public class testfanxin {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("hello","你好");
        map.put("how are you","吃了吗");
        System.out.println(map.get("hello"));
        System.out.println(map.get("how are you"));
    }
}
