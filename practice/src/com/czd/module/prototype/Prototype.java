package com.czd.module.prototype;

/**
 * Created by Administrator on 2018/1/25.
 */
public class Prototype implements Cloneable {
    @Override
    public Prototype clone(){
        Prototype prototype=null;
        try{
            prototype= (Prototype) super.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
