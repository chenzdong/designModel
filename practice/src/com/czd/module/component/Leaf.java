package com.czd.module.component;

/**
 * 叶子节点
 *
 * @author: czd
 * @create: 2018/7/26 10:36
 */
public class Leaf extends Component {
    public Leaf(String name){
        super(name);
    }
    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void add(Component component) {

    }
}
