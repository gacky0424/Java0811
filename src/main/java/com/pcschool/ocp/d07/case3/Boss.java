package com.pcschool.ocp.d07.case3;

public class Boss extends Manager{
    public int Salary = 100000;
    public void printfire(){
        System.out.println("開除員工");
    }
     public void job(){
        System.out.println("找case,發薪水");
    }
}
