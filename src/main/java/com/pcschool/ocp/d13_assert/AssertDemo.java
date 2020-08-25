package com.pcschool.ocp.d13_assert;

public class AssertDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        //期望 x > y
        //若在project的properties裡的Run裡沒有下達-ea,assert就不會執行...等於白寫
        assert(x > y):String.format("x 沒有大於 y(%d)", x, y);
        System.out.println(x + y);
             
    }
}
