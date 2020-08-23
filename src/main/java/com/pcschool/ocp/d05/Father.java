package com.pcschool.ocp.d05;

public class Father {
    //層級是protected,雖然與子類別son2不同package,但子類別可以存取資料
    protected int money = 1000_0000;
    public void play() {
        System.out.println("會玩Golf");
    }
}
