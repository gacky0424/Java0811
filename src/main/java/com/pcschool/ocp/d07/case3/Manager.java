package com.pcschool.ocp.d07.case3;

public class Manager extends Employee{
    public int Salary = 50000;
    public void printBudget(){
        System.out.println("編列預算");
    }
     public void job(){
        System.out.println("管進度");
    }
}
