package com.pcschool.ocp.d08.case3;
//子類別Edog利用extend(繼承)關鍵字使用父抽象類別(Dog)的資源
public class EDog extends Dog {

    public void eat() {
        System.out.println("吃電");
    }

    public void skill() {
        System.out.println("打遊戲");
    }

}
