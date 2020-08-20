package com.pcschool.ocp.d09.case1;

public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee.Job job = emp.new Job();
        job.program();//呼叫program類別
        job.meeting();//呼叫meeting類別
        
        //Employee.Study study = emp.new Study();
        //study.read();//呼叫study外部類別裡的方法read
        
        //寫Android App會使用到內部類別
    }
}
