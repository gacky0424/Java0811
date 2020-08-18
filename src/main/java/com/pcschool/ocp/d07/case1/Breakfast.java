package com.pcschool.ocp.d07.case1;

import com.pcschool.ocp.d07.case1.food.Hamburger;
import com.pcschool.ocp.d07.case1.food.Sandwich;
import com.pcschool.ocp.d07.case1.material.Hotdog;
import com.pcschool.ocp.d07.case1.material.Pork;

public class Breakfast {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich("火腿蛋三明治");
        Hotdog hotdog = new Hotdog();
        sandwich.addMaterial(hotdog).addMaterial((new Pork()));//增加Hotdog
        System.out.println(sandwich.getName());
        System.out.println(sandwich.getPrice());
        
        Hamburger hamburger = new Hamburger("牛肉蛋堡");
        System.out.println(hamburger.getName());
        System.out.println(hamburger.getPrice());
    }
}
