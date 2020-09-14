package com.pcschool.ocp.d08;

import com.pcschool.ocp.d08.Ball;

public class BallStore {
    public static void main(String[] args) {
        Ball b1 = new Ball("Red", 100);
        Ball b2 = new Ball("Red", 100);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);//雙等號是比較記憶體位址
        System.out.println(b1.equals(b2));//equlas()是比較實例內含值(?)
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
