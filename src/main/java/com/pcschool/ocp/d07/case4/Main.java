package com.pcschool.ocp.d07.case4;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //取得 json 字串
        String path ="src\\main\\java\\com\\pcschool\\ocp\\d07\\case4\\programmer.json";
        String json = new Scanner(new File(path)).useDelimiter("\\A").next();
        //System.out.println(json);
        //透過 Gson 將 json 資料匯入到 Programmer[] 陣列中
        Programmer[] programmers = new Gson().fromJson(json, Programmer[].class);
        //有幾筆資料?
        System.out.printf("資料筆數: %d\n",programmers.length);
        //請問所有 Programmer 總薪資?平均薪資?最高?最低?
        
        int sum = Arrays.stream(programmers).mapToInt(p -> p.getSalary()).sum();
        System.out.printf("總薪資: %d\n", sum);
        
        //統計
        IntSummaryStatistics stat = Arrays.stream(programmers)
                .mapToInt(p -> p.getSalary())
                .summaryStatistics();
        System.out.printf("總薪資: %,d 平均: %,.1f 最高: %,d 最低: %,d\n",
                        stat.getSum(), stat.getAverage(), stat.getMax(),stat.getMin());
        //java平薪
        double javaAvg = Arrays.stream(programmers)
                .filter(p -> p.getName().equals("java") )//過濾
                .mapToInt(p -> p.getSalary())
                .summaryStatistics()
                .getAverage();
        System.out.printf("Java 平均薪資: %.1f\n", javaAvg);
        //php平薪
        double PHPAvg = Arrays.stream(programmers)
                .filter(p -> p.getName().equals("php") )//過濾
                .mapToInt(p -> p.getSalary())
                .summaryStatistics()
                .getAverage();
        System.out.printf("PHP 平均薪資: %.1f\n", PHPAvg);
        //Male平薪
        double mAvg = Arrays.stream(programmers)
                .filter(p -> p.getSex().equals("m") )//過濾
                .mapToInt(p -> p.getSalary())
                .summaryStatistics()
                .getAverage();
        System.out.printf("男性平均薪資: %.1f\n", mAvg);
        //Female平薪
        double fAvg = Arrays.stream(programmers)
                .filter(p -> p.getSex().equals("f") )//過濾
                .mapToInt(p -> p.getSalary())
                .summaryStatistics()
                .getAverage();
        System.out.printf("女性平均薪資: %.1f\n", fAvg);
        
    }
}
