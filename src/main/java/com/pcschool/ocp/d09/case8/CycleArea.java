package com.pcschool.ocp.d09.case8;

import java.util.Arrays;
import java.util.function.Supplier;

public class CycleArea {

    public static void main(String[] args) {
        int[] rs = {5, 10, 15, -4, 20, 0, -25};
        Supplier<Double> pi = () -> Math.PI;//Supplier,
        Arrays.stream(rs)
                .filter((r) -> r > 0)// Predicate, Intpredicate=>就是直接給你int,無聊 get(5,10,15,20)
                .mapToDouble((r) -> r * r * Math.PI)// Funcution, mapToDouble=>收int型,回傳double型
                //.mapToDouble((r) -> r * r * pi.get()) //Function
                .forEach(area -> System.out.println(area));//Consumer, 
    }
}
