package com.pcschool.ocp.d06.case3;

import com.pcschool.ocp.d06.case3.drink.GreenMilkTea;
import com.pcschool.ocp.d06.case3.drink.GreenPearlTea;
import com.pcschool.ocp.d06.case3.drink.GreenTea;
import com.pcschool.ocp.d06.case3.drink.PearlTea;

public class DrinkStore {
    public static void main(String[] args) {
        /*PearlTea pearlTea = new PearlTea();
        System.out.println(pearlTea.getPrice());
        System.out.println("----------------------");
        GreenTea greenTea = new GreenTea();
        System.out.println(greenTea.getPrice());
        System.out.println("----------------------");
        GreenMilkTea greenMilklTea = new GreenMilkTea();
        System.out.println(greenMilklTea.getPrice());
        System.out.println("----------------------");*/
        GreenPearlTea greenPearlTea = new GreenPearlTea();
        System.out.println(greenPearlTea.getPrice());
        System.out.println("成分:");
        greenPearlTea.getMaterials()
                .stream()
                .forEach(m -> {
                    System.out.println(m.getName() +" $" + m.getPrice());                  
                });
    }
          
}
