package com.czd.module.memento;

/**
 * 客户端调用
 *
 * @author: czd
 * @create: 2018/8/3 15:27
 */
public class Client {
    public static void main(String[] args) {
        ChessOriginator chessOriginator=new ChessOriginator("象",1,2);
        ChessCaretaker chessCaretaker=new ChessCaretaker();
        System.out.println(chessOriginator.createChessMemento().toString());
        //备份
        chessCaretaker.setMemento(chessOriginator.createChessMemento());
        chessOriginator.setY(3);
        chessOriginator.setX(2);
        System.out.println(chessOriginator.createChessMemento().toString());
        System.out.println("悔棋");
        //还原
        chessOriginator.restore(chessCaretaker.getMemento());
        System.out.println(chessOriginator.createChessMemento().toString());

    }

}
