package com.czd.module.component;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合节点
 *
 * @author: czd
 * @create: 2018/7/26 10:41
 */
public class Composite extends Component {
    private List<Component> list=new ArrayList<>();
    public Composite(String name){
        super(name);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void display() {
        System.out.println(name);
        for (Component component:list){
            component.display();
        }
    }
}
