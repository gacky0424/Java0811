package com.pcschool.ocp.d09.case8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.UnaryOperator;

public class BMIConsumer {
    public static void main(String[] args) {
        //BiConsumer的兩個值不一定要同樣型態
        BiConsumer<Double, Integer>bc = (h, w) -> System.out.println(w / Math.pow(h/100, 2));
        bc.accept(170.0, 60);
        //
        BiFunction<Double, Integer, Double> bf1 = (h, w)->w / Math.pow(h/100, 2);
        BiFunction<Double, Integer, Double> bf2 = (h, w)-> h * w; 
        double bmi = bf2.apply(170.0, 60);
        System.out.println(bmi);
        //--------------------------------------------------------------------------
        BiFunction<Double, Double, Double> bf3 = (h, w) -> w/Math.pow(h/100, 2);
        System.out.println(bf3.apply(170.0, 60.0));    
        //2個參數型別與回傳值是一樣型別 例子裡的參數與回傳值的型別都是Double
        BinaryOperator<Double> bo = (h, w) -> w/Math.pow(h/100, 2);//TTT
        System.out.println(bo.apply(170.0, 60.0));
    
        //攝氏轉華氏 3種不同寫法可求出一樣答案,下面越簡略
        Function<Double, Double> f1 = (c) -> (c) * (9.0/5) + 32;
        UnaryOperator<Double>    uo = (c) -> (c) * (9.0/5) + 32;// Function<Double, Double>
        DoubleUnaryOperator      du = (c) -> (c) * (9.0/5) + 32;// UnaryOperator<Double>
        System.out.println(f1.apply(0.0));
        System.out.println(uo.apply(0.0));
        System.out.println(du.applyAsDouble(0.0));
        //----------------------------------------------------------------------
        //BinaryOperator<Integer> scoreAvg = (chinese, english) -> (chinese + english)/2;
        //ObjIntConsumer<BinaryOperator<Integer>> oic = (avg, pass) -> System.out.println(avg.apply(pass, pass));
    }
}
