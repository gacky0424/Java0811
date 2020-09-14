package com.pcschool.ocp.d10.case3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import static java.util.Locale.filter;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        //集合預設可以放入任意 Object 資料
        Set set = new LinkedHashSet();
        set.add("國文");
        set.add(new Integer(100));
        set.add("英文");
        set.add(80);// new Integer(80) 或 Integer.valueof(80)
        set.add("數學");
        set.add(90);
        System.out.println(set);
        //尋訪器(遍歷每一個元素)
        Iterator iter = set.iterator();
        while (iter.hasNext()) {//確認是否有元素            
            Object next = iter.next();//取得元素內容
            System.out.println(next);//印出元素內容
        //會自動往下尋訪
        }//集合就是一個物件陣列!
        //再取得一次尋訪器時,可省略 Iterator
        //iter = set.iterator();
        
        //集合就是一個物件陣列!{國文, 100, 英文, 80, 數學, 90} 物件陣列 Object[]
        //------Java 7 的寫法------
        int sum = 0;
        while (iter.hasNext()) {
            Object next = iter.next();
            if(next instanceof Integer){
                sum += (Integer)next;
            }    
        }
        System.out.println(sum);
        
        //-----Java 8 的寫法-----
        sum = set.stream()
                .filter(note -> note instanceof Integer)
                .mapToInt(score -> (Integer)score)//自動拆箱裝向,會自動呼叫intValue()
                .sum();
        System.out.println(sum);
    }
}
