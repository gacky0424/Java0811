package com.pcschool.ocp.d02;

public class StringTest2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");//s3 在 pool 外面,不可共用
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        s3 = s3.intern();//利用 intern 把 s3 放到 pool 裡面,節省記憶體,可共用
        System.out.println(s1 == s3);
       
    }
}
