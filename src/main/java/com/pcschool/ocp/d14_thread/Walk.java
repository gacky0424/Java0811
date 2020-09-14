package com.pcschool.ocp.d14_thread;

public class Walk implements Runnable{
    private static boolean gameover;//一定要是static(共用),類別變數

    @Override
    public void run() {
        job(); 
    }
    
    private void job(){
        String tName = Thread.currentThread().getName();
        for(int i=1;i<=1000 && !gameover;i++){
            System.out.printf("%s 跑了 %d 步\n", tName, i);
        }
        gameover = true;
    }
}
