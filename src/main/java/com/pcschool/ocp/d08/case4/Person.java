package com.pcschool.ocp.d08.case4;

public abstract class Person {
    private String name;//private 只能在此類別存取欄位及方法
    private int age;
    private double bmi;

    public Person(String name, int age, double bmi) {
        this.name = name;
        this.age = age;
        this.bmi = bmi;
    }

    public String getName() {
        return name;//回傳 name 字串
    }

    public int getAge() {
        return age;//回傳 age
    }

    public double getBmi() {
        return bmi;//回傳 BMI
    }

    @Override
    public abstract String toString();
}