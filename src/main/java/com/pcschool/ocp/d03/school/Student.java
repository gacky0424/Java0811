package com.pcschool.ocp.d03.school;

public class Student {
    private String name;
    private int age;
    private BMI bmi;
    
    //insert code -> constructor
    public Student(String name, int age, BMI bmi) {
        this.name = name;
        this.age = age;
        this.bmi = bmi;
    }
    
    //insert code -> toString
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", bmi=" + bmi + '}';
    }
    
}