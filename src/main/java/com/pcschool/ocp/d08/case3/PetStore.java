package com.pcschool.ocp.d08.case3;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class PetStore {
    public static void main(String[] args) {
        Pet[] pets = {new EDog(), new Yorkshire(), new Chihuahua(), new Persian()};
        
        //狗都吃那些東西 ?
        Arrays.stream(pets)
                .filter(p -> p instanceof Dog)
                .forEach(p -> p.skill());
        System.out.println("-----------------------------------------------");
        //貓都吃那些東西 ?
        Arrays.stream(pets)
                .filter(p -> p instanceof Cat)
                .forEach(p -> p.skill());
    
        //寵物的腿數共有幾隻 ?
        //int amount = pets.length;
        long amount = Arrays.stream(pets).count();
        System.out.println(amount * Pet.legs);
    }
    
}
