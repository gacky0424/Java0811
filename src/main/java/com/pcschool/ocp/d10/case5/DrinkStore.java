package com.pcschool.ocp.d10.case5;

import java.util.Set;
import java.util.TreeSet;

public abstract class DrinkStore implements Comparable<Drink>{
    public static void main(String[] args) {
        Drink coffee = new Drink("咖啡", 100);
        Drink tea = new Drink("紅茶", 50);
        Drink milk = new Drink("牛奶", 70);
        //TreeSet
        Set<Drink> drinks = new TreeSet<>();
        drinks.add(coffee);
        drinks.add(tea);
        drinks.add(milk);
        System.out.println(drinks);
    }
}
/*TreeSet一定考!TreeSet有由小到大排序的效果,意思就是有元素比較的機制,必須給它比較法則*/