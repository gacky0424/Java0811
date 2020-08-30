package com.pcschool.ocp.d09.case1;

/*內部類別 program,meeting*/
//(一般)外部類別
public class Employee {

    String name = "月例會";

    //一般內部類別
    class Job {

        String name = "Java";

        public void program() {
            String name = "寫程式";
            System.out.println(name + ":" + this.name);//取得一般內部資料
            //執行結果-> 寫程式:Java
            Study study = new Study();
            study.read();//取得study(Study實體)的read方法

        }

        public void meeting() {
            String name = "開會";
            System.out.println(name + ":" + Employee.this.name);//取的外部資料須用Employee.this.~
        }
    }

    //在一般內部類別使用private時,外部不可呼叫
    private class Study {

        public void read() {
            String appname = "美食 App";// Java 7 要加上 final, Java 8 不用(系統會自動判斷)
            System.out.println("進修");
            int hours = 60;
            System.out.println("進修時間:" + hours + "H");
            //方法內部類別,class前不行有任何東西,自動判斷inal
            class App {

                public void printName() {
                    System.out.println(appname);// 取用 final 變數
                }
            }
            App app = new App();
            app.printName();
        }

    }

}
