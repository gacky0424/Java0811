package com.pcschool.ocp.d10.case6;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        //通通都是Integer的陣列
        list.add(1);
        list.add(0, 3);
        list.add(4);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(3));
        //寫數字是移除那個數字的位置!!
        System.out.println("我要移除(3): " + list.remove(3));
        System.out.println(list);
        //移除數字要寫(Integer)的位置!因為是Integer的資料(?)
        System.out.println("我要移除((Integer(3)): " + list.remove(new Integer(3)));
        System.out.println(list);
        System.out.println("我要移除((Integer(5)): " + list.remove(new Integer(5)));
        System.out.println(list);
    }
}
/**/