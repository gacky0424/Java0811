package com.pcschool.ocp.d05.foo;

import com.pcschool.ocp.d05.Father;//要存取不同package的父類別資料需要import

public class Son2 extends Father {
    public void print() {
        System.out.println(money);
    }
    public void play() {//與父類別擁有同樣方法,這個方法會變"覆寫(overriding)"
        System.out.println("會玩baseball");
    }
}