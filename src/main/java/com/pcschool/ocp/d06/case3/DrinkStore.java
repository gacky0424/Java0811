package com.pcschool.ocp.d06.case3;

import com.pcschool.ocp.d06.case3.drink.GreenMilkTea;
import com.pcschool.ocp.d06.case3.drink.GreenPearlTea;
import com.pcschool.ocp.d06.case3.drink.GreenTea;

public class DrinkStore {
    public static void main(String[] args) {
        /*PearlTea pearlTea = new PearlTea();
        System.out.println(pearlTea.getPrice());*/
        GreenTea greenTea = new GreenTea();
        System.out.println(greenTea.getPrice());
        System.out.println("----------------------");
        GreenPearlTea greenPearlTea = new GreenPearlTea();
        System.out.println(greenPearlTea.getPrice());
        System.out.println("----------------------");
        GreenMilkTea greenMilklTea = new GreenMilkTea();
        System.out.println(greenMilklTea.getPrice());
    }
          
}
