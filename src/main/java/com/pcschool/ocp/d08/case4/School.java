package com.pcschool.ocp.d08.case4;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Person[] persons = {
            new Teacher("T1", 30, 23.3, 70000),
            new Teacher("T2", 35, 25.4, 90000),
            new Student("S1", 16, 17.5),
            new Student("S2", 17, 22.5),
            new Student("S3", 18, 24.5),
        };
        // 全部 Java8 的寫法
        // 請問平均年齡 ?
        double ageAVG = Arrays.stream(persons)
                              .mapToInt(p -> p.getAge())
                              .summaryStatistics().getAverage();
        /**/
        System.out.printf("平均年齡: %.2f\n", ageAVG);
        // 請問 Teacher 平均薪資 ?
        double salaryAVG = Arrays.stream(persons)
                              .filter(p -> p instanceof Teacher)//過濾
                              .map(p -> (Teacher)p)
                              .mapToInt(t -> t.getSalary().getMoney())
                              .average()
                              .getAsDouble();
        
        // 請問 學生 平均 BMI ?
        double bmiAVG = Arrays.stream(persons)
                              .filter(p -> p instanceof Student)//過濾
                              .mapToDouble(p -> p.getBmi())
                              .summaryStatistics().getAverage();
        //將名字中有"2"的人列出
        //Arrays.stream(persons).forEach(p -> System.out.println(p));
        Arrays.stream(persons)
                .filter(p -> p.getName().contains("2"))//過濾,使用contains()取的名字內包含"2"的老師學生
                .forEach(System.out::println);//技巧,省略 p-> 的寫法
    }
}