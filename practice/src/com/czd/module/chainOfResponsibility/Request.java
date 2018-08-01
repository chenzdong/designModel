package com.czd.module.chainOfResponsibility;

/**
 * 请求实体类
 *
 * @author: czd
 * @create: 2018/8/1 15:05
 */
public class Request {
    private String content;
    private int price;
    public Request(String content,int price){
        this.content=content;
        this.price=price;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
