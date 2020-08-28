package com.pcschool.ocp.d07.case3;

public class Company2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Boss();
        System.out.println(emp1.Salary);//直接抓實體Employee的屬性欄位
        emp1.job();//呼叫實體Employee的job方法
        
        System.out.println("實體轉型前薪水: " + emp2.Salary);//屬性欄位並不會執行覆寫,因此得到的數值會是實體Employee的
        System.out.println("實體轉型後薪水: " + ((Boss)emp2).Salary);//若想取得實體Boss的salary屬性,能利用向上轉型後取得
        emp2.job();//覆寫
    }
}
