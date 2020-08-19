package com.pcschool.ocp.test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class FlatMap2 {

    public static void main(String[] args) {
        String[][] names = {
            {"John", "Marry"},
            {"Java", "Python", "VB"},
            {"Android", "iPhone"}
        };
        IntSummaryStatistics stat = null;
        // 請問總共幾個字母 ?
        stat = Arrays.stream(names)
                .flatMap(s -> Stream.of(s))
                .mapToInt(String::length)
                .summaryStatistics();
        
        stat = Arrays.stream(names)
                .flatMap(Stream::of)
                .mapToInt(String::length)
                .summaryStatistics();
        
        // 長度最長的是幾個字 ?

        // 長度最短的是幾個字 ?
    }

}
