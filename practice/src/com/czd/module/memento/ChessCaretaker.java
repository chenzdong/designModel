package com.czd.module.memento;

/**
 * 象棋备忘录管理类
 *
 * @author: czd
 * @create: 2018/8/3 15:26
 */
public class ChessCaretaker {
    private ChessMemento memento;

    public ChessMemento getMemento() {
        return memento;
    }

    public void setMemento(ChessMemento memento) {
        this.memento = memento;
    }
}
