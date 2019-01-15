package com.czd.module.iterator;

import java.util.*;

/**
 * 迭代器模式
 *
 * @author: czd
 * @create: 2018/8/2 14:39
 */
public class iterator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(6);
        Collections.shuffle(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
