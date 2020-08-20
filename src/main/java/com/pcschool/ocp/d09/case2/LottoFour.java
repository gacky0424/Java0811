package com.pcschool.ocp.d09.case2;

import com.pcschool.ocp.d09.case3.Lotto;
import java.util.Random;

public class LottoFour implements Lotto {

public void printNumber() {
        Random r = new Random();
        System.out.printf("%d %d %d %d\n", r.nextInt(10), r.nextInt(10), r.nextInt(10), r.nextInt(10));
    }

}