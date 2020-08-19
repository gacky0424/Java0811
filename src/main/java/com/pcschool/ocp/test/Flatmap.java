package com.pcschool.ocp.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import jdk.nashorn.internal.objects.NativeArray;

public class Flatmap {

    public static void main(String[] args) {
        int[][] scores = {
            {100, 90, 80},
            {70, 60, 50}
        };
        //四種語法
        Arrays.stream(scores)//陣列是裸的資料,給他穿上衣服(??)
                .flatMapToInt(s -> Arrays.stream(s));
        Arrays.stream(scores)
                .flatMapToInt(Arrays::stream);
        Arrays.stream(scores)
                .flatMapToInt(s -> IntStream.of(s));
        Arrays.stream(scores)
                .flatMapToInt(IntStream::of);
        //-----------------------------------------------------
        Arrays.stream(scores)
                .flatMapToInt(Arrays::stream)
                //.forEach(s -> System.out.println(s))
               .forEach(System.out::println);
        
    }
}
