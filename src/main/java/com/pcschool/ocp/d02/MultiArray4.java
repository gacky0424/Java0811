package com.pcschool.ocp.d02;

public class MultiArray4 {
    public static void main(String[] args) {
        //三維陣列
        int[][][]x = {
                    {{100, 90, 80},{70, 60, 50}},
                    {{70, 60},{50}}
                    };
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[0][0]);
        System.out.println(x[0][0][0]);
        //寫一個for-loop將資料全部印出
        for(int i=0;i<x.length;i++){
            //System.out.println(x[i]);     
            for(int j=0;j<x[i].length;j++){
                //System.out.println(x[i][j]);
                for(int k =0;k<x[i][j].length;k++){
                    System.out.println(x[i][j][k]);
                }
            }
        }
        /*for(int k=0;k<x.length;k++) {
            for (int i = 0; i < x[k].length; i++) {
                for (int j = 0; j < x[k][i].length; j++) {  
                    System.out.println(x[k][i][j]);
                }
            } 
        }*/
    }
}
