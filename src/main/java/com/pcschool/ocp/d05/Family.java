package com.pcschool.ocp.d05;

import com.pcschool.ocp.d05.foo.Son2;
import com.pcschool.ocp.d05.foo.Son3;

public class Family {
    public static void main(String[] args) {
        Son son = new Son();
        son.print();
        son.play();
        /*雖然在子類別裡除了print方法以外並沒有寫其他方法,不過因為繼承父類別,
        在子類別不用寫出來,子類別也會擁有父類別的屬性,方法.所以這裡不會有編譯錯誤的警告*/
        
        Son2 son2 = new Son2();
        son2.print();
        son2.play();//使用了覆寫,所以顯示的方法並非Golf,而是baseball
        //在子類別有了同樣方法,就會執行覆寫,子類別的方法會被優先,(所謂青出於藍而勝於藍)
        
        Son3 son3 = new Son3();//只能建立實例
        son3.print();//因為沒有繼承關係,並不會顯示任何東西
    }
}

