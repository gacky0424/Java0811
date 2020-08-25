package com.pcschool.ocp.d14_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndRunnable {
    public static void main(String[] args) throws Exception{
        Runnable r = () -> {
            System.out.println("在 Runnable當中得到 Java");
            return;//無回傳值
        };
        Callable<String> c = () -> {
            System.out.println("在 Runnable當中得到 Python");
            return "Python";////有回傳值
        };
        ExecutorService service = Executors.newCachedThreadPool();//newCachedThreadPool有風險
        Future f1 = service.submit(r);
        Future f2 = service.submit(c);
        System.out.println(f1.get());//會得到 null ,因為沒有回傳值
        System.out.println(f2.get());//Python
        service.shutdown();//關閉服務(不加shutdown會一直執行)
    }
}
