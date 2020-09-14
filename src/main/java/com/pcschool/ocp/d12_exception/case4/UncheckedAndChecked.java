package com.pcschool.ocp.d12_exception.case4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UncheckedAndChecked {
    public static void main(String[] args) {
        a(0);
        b(0);
        try {
            c(0);
        } catch (ArithmeticException e) {
            System.out.printf("main 自行處理數學錯誤: %d\n", e);
        }
        try {
            d(0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    //A自己處理
    public static void a(int d) {
        int x = 10;
        try {
            int result = x/d;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("分母不可為0");
        }
        
    }
    //先知先覺,比a還聰明,有效率
    public static void b(int d) {
        int x = 10;
        if(d == 0){
            System.out.println("分母不可為0");
            return;
        }
        int result = x/d;
        System.out.println(result);
    }
    //c方法不想管錯誤時,呼叫c的必須要處利錯誤,不寫try會有風險
    public static void c(int d) {
        int x = 10;
        int result = x/d;
        System.out.println(result);
    }
    //把這個錯誤丟給main,這種處理方式最有效率,最聰明!!
    public static void d(int d) throws Exception{//拋出例外
        int x = 10;
        if(d == 0){
            //自己建立一個錯誤物件
            Exception e = new Exception("d 說: 分母不可為0");
            throw e;
        }
        int result = x/d;
        System.out.println(result);
    }
}
