package com.pcschool.ocp.game.case2;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        //int[] ans = {3, 8, 4, 5};
        int[] ans =Util.getRandomIntArray(4);
        int[] user = {0, 0, 0, 0};
        //遊戲開始
        /*A數字位置對
          B數字對位置不對*/
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("請猜一個重複四位數:");
            //使用者猜
            String userAns = sc.next();
            // 資料填入 user 陣列
            for (int i = 0; i < user.length; i++) {
                user[i] = Integer.parseInt(userAns.charAt(i) + "");
            }
            // 列出 user 陣列資料
            for (int x : user) {
                System.out.print(x + " ");
            }
            // 幾 A 幾 B ?
            int a = 0;
            int b = 0;
            // 計算 B
            for (int ur : user) {
                for (int as : ans) {
                    if (ur == as) {
                        b++;
                    };
                }
            }
            // 計算 A
            for (int i = 0; i < user.length; i++) {
                if (user[i] == ans[i]) {
                    a++;
                }
            }
            // 減去多算的 B (同位置的)
            b = b - a;
            System.out.printf("%dA%dB\n", a, b);
            if(a == 4) {
                System.out.println("Bingo !");
                break;
            }
        }

    }
}
        /*//第一次猜
        String userAns = "3485";
        //資料填入 user 陣列
        for(int i=0;i<user.length;i++){
            user[i] = Integer.parseInt(userAns.charAt(i) + "");
        }
        //列出 user 陣列資料
        for(int x : user){
            System.out.print(x + " ");
        }
        System.out.println();
        //幾 A 幾 B ?
        int a = 0;
        int b = 0;
        //計算 B
        for(int ur : user){
            for(int as : ans){
                if(ur == as){
                    b++;
                }
            }
        }
        //計算 A
        for(int i=0;i<user.length;i++){
            if(user[i] == ans[i]){
                a++;
            }
        }
        //減去多算的 B (同位置的)
        b = b - a;
        System.out.printf("%dA%dB\n",a ,b);*/
