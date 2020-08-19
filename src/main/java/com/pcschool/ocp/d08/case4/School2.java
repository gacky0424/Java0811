package com.pcschool.ocp.d08.case4;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class School2 {

    public static void main(String[] args) {
        Person[] p1 = {
            new Teacher("T1", 30, 23.3, 70000),
            new Teacher("T2", 35, 25.4, 90000),
            new Student("S1", 16, 17.5),
            new Student("S2", 17, 22.5),
            new Student("S3", 18, 24.5),};
        Person[] p2 = {
            new Teacher("T1", 30, 23.3, 70000),
            new Teacher("T2", 35, 25.4, 90000),
            new Teacher("S1", 16, 26.4, 80000),
            new Student("S2", 17, 22.5),
            new Student("S3", 18, 24.5),};
        Person[][] persons = {p1, p2};
        //求 Teacher 的平均薪資?
        double salaryAVG = Arrays.stream(persons)
                .flatMap(Stream::of)
                .filter(p -> p instanceof Teacher)
                .map(p -> (Teacher)p)
                //若有編譯錯誤,可使用peek確認轉換完之後的物件資料
                //.peek(t -> System.out.println(t.getSalary().getMoney()))
                .mapToInt(t -> t.getSalary().getMoney())
                //.peek(System.out::println) 建議一個一個確認,確認全部會搞不清楚資料
                .average()
                .getAsDouble();
                System.out.println(salaryAVG);
                
    }

}
