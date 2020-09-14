package com.pcschool.ocp.d10.case3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(100);
        set.add(90);
        set.add(80);
        Iterator<Integer> iter = set.iterator();
        int sum = 0;
        while(iter.hasNext()){
            Integer next = iter.next();
            sum += next;
        }
        System.out.println(sum);
        // java8 --2種方法--
        sum = set.stream()                
                .mapToInt(i -> (Integer)i)//
                .sum();
        System.out.println(sum);
        sum = set.stream()                
                .mapToInt(i -> ((Integer)i).intValue())//
                .sum();
        System.out.println(sum);
    }
}
