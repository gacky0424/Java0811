package com.pcschool.ocp.d02;

public class MultiArray3 {
    public static void main(String[] args) {
        int[][] x = {{100, 90, 80}, {70, 60, 50}, {40, 30}, {20}};
        System.out.println("x length = " + x.length);//4,[0~3]
        
        for(int k=0;k<x.length;k++) {
            for (int i = 0; i < x[k].length; i++) {
                //System.out.println("x length = " + x.length);
                //System.out.println("x[k] length = " + x[k].length);
                //3[0~2],3[0~2],2[0~1],1[0]
                System.out.println(x[k][i]);
            } 
        }
        
        
        
        
        
    }
}