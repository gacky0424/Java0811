package com.pcschool.ocp.d07.case3;

public class Company2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Boss();
        System.out.println(emp1.Salary);//直接抓屬性會從emp2前判斷,抓方法會從new後面判斷
        System.out.println(emp2.Salary);
    }
}
