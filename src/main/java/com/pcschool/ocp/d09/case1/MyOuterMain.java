package com.pcschool.ocp.d09.case1;

public class MyOuterMain {
    public static void main(String[] args) {
        MyOuter.MyInner mi = new MyOuter().new MyInner();
        mi.print();
        System.out.println("======================================");
        MyOuter.MyStaticInner msi = new MyOuter.MyStaticInner();//靜態
        msi.print();
    }
}
/*
匿名類別:沒有直接宣告名稱的類別,直接以new關鍵字來建立的類別實體
!!適用時機是在整個程式中只用到一次,之後便不需再次使用
*/
