package com.pcschool.ocp.d10.case6;

import java.util.Random;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> v = new Vector<>(25, 5);//超越25時,指令長度只能增加5
        for (int i = 1; i < 26; i++) {
            v.add(new Random().nextInt(100));
            System.out.printf("capacity: %d size: %d\n", v.capacity(), v.size(), v);//size是資料
            Thread.sleep(2000);
        }    
    }
}
/*Vector的長度預設值(default)為10,若在預設值的狀況下長度超過10時,長度會以 (原本長度 * 2) 的方法自動增加*/