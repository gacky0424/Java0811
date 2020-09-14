package com.pcschool.ocp.d10.case4;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.ToIntFunction;

public class School {

    public static void main(String[] args) {
        //2種方法
        //先寫名字再給分數
        Student s1 = new Student("John");
        s1.addScore(80).addScore(90).addScore(90).addScore(70);//技法,呼叫完後還是Student的狀態
        //Student s2 = new Student("Mary");
        //s1.addScore(0).addScore(0).addScore(0).addScore(0);

        //先寫分數再寫名字
        Set<Exam> exams = new LinkedHashSet<>();//把分數準備好
        exams.add(new Exam(90));
        exams.add(new Exam(80));
        exams.add(new Exam(70));
        exams.add(new Exam(100));
        Student s2 = new Student("Mary", exams);

        System.out.println(s1);
        System.out.println(s2);

        //全班
        Set<Student> students = new LinkedHashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students);

        //以每人的最高分來平均?
        double avg = students.stream()
                .mapToInt(s -> s.getExams().stream()                    //{80, 90, 70} 產生 Intrger[]
                                           .mapToInt(e -> e.getScore()) //{80, 90, 70} 轉型為 int[]
                                           .summaryStatistics()         //統計運算
                                           .getMax())                   //取出最大值90
                .average()      //處理平均
                .getAsDouble(); //取得double型態
        System.out.println(avg);
        //在 Exam 中取出最高分得方法
        //ToIntFunction<Exam> tif = e -> e.getScore();

    }
}
