package com.pcschool.ocp.d09.case2;

import com.pcschool.ocp.d09.case3.Lotto;
import java.util.Random;

public class LottoFour implements Lotto {//實作Lotto類別

    public void printNumber() {//定義方法的內容來執行介面Lotto2的方法,(算覆寫?)
        Random r = new Random();
        System.out.printf("%d %d %d %d\n", r.nextInt(10), r.nextInt(10), r.nextInt(10), r.nextInt(10));
    }

}
