package com.pcschool.ocp.d14_thread;

class Brother extends Thread{

    @Override
    public void run() {
        System.out.println("哥哥下班回家");
        System.out.println("哥哥準備洗澡");
        System.out.println("哥哥發現沒瓦斯了");
        System.out.println("哥哥打電話請瓦斯工人送瓦斯");
        Worker worker = new Worker();
        worker.start();
        try {
            worker.join(5000);//最常等待時間,要比worker還要短
        } catch (Exception e) {
            
        }
        System.out.println("哥哥開始洗澡");
        System.out.println("哥哥洗完澡了");
    }
    
}

class Worker extends Thread{

    @Override
    public void run() {
        System.out.println("工人開始送瓦斯");
        //模擬送瓦斯的時間
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            System.out.println("瓦斯工人發生意外");
        }
        System.out.println("工人將瓦斯送到家");
    }
    
}

public class Shower {
    public static void main(String[] args) {
      Brother brother = new Brother();
      brother.start();
    }
}
