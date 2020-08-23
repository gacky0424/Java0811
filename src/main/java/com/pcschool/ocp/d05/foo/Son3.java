package com.pcschool.ocp.d05.foo;

import com.pcschool.ocp.d05.Father;
//son3沒有繼承父類別沒辦法存取父類別資料,但可以使用import建立物件,不過沒有任何繼承因素
public class Son3  {
    public void print() {
        Father father = new Father();
        //System.out.println(father.money); // 無法使用
    }
}