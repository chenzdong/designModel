package com.czd.module.singleton;

/**
 * 双重加锁机制单例
 *
 * @author: czd
 * @create: 2018/6/27 13:44
 */
public class UpperSingleton {
    //加上volatile 防止指令重排，获取尚未初始化的对象
    private volatile  static UpperSingleton instance = null ;
    private UpperSingleton(){}
    public static UpperSingleton getInstance(){
        if(instance==null){
            synchronized (UpperSingleton.class){
                if (instance == null ) {
                    instance = new UpperSingleton();
                }
            }
        }
        return instance;
    }
}
