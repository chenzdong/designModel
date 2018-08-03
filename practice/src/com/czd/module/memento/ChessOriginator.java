package com.czd.module.memento;

/**
 * 象棋原发器
 *
 * @author: czd
 * @create: 2018/8/3 15:18
 */
public class ChessOriginator {
    private String label;

    private int x;

    private int y;

    //保存状态 用于负责人存储
    public ChessMemento createChessMemento(){
        return new ChessMemento(this.label,this.x,this.y);
    }
    //恢复状态 从负责人那获取
    public void restore(ChessMemento chessMemento){
        this.label=chessMemento.getLabel();
        this.x=chessMemento.getX();
        this.y=chessMemento.getY();
    }

    public ChessOriginator(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



}
