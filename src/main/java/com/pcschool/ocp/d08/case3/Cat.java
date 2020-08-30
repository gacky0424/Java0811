package com.pcschool.ocp.d08.case3;
//此類別(抽象類別?)使用介面.取得了 Pet類別的方法,擁有多繼承的效果(?)
public abstract class Cat implements Pet {

    public void eat() {
        System.out.println("魚");
    }
}

