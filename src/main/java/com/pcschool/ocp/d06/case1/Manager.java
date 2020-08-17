package com.pcschool.ocp.d06.case1;

public class Manager extends Employee {
    //因為繼承,Company可以呼叫setSalary
    public Manager(){
        setSalary(50000);
    }
}    
