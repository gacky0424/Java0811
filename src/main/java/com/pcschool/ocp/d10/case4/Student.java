package com.pcschool.ocp.d10.case4;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Student implements Comparable<Student>{
    private String name;
    private Set<Exam> exams;//考幾次?  平均由這裡而來

    public Student(String name) {
        this(name, new LinkedHashSet());//建立一個空的集合
    }

    public Student(String name, Set<Exam> exams) {
        this.name = name;
        this.exams = exams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public Student addScore(int score) {//基本上不會寫setScore
        Exam exam = new Exam(score);
        exams.add(exam);
        return this;//連加分數
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", exams=" + exams + '}';
    }

    @Override
    public int compareTo(Student other) {
        double avg       = this.exams.stream().mapToInt(e -> e.getScore()).average().getAsDouble();
        double avg_other = other.exams.stream().mapToInt(e -> e.getScore()).average().getAsDouble();
        return (int)(avg_other - avg);
    }
    
    
}
