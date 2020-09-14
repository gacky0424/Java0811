package com.pcschool.ocp.d08.army;

import java.util.Arrays;

public class ArmyMain {
    public  ArmyMain(){
        
    }
    public static void main(String[] args){
        Airplane[] airplanes = {new Fighter(), new Fighter(), new Fighter()};//不可輸入抽象類別,
        Car[] cars = {new Tank(), new Truck(), new Truck(), new Tank()};
        Weapon[] weapons = {new Fighter(), new Tank()};//雖然Fihgter,Tank是不同類別,但都屬於Weapon的原因,可通用
        // cars 統一發射武器
        for(Car car : cars){
            if(car instanceof Tank){
                ((Tank)car).shoot();
            }
        }
        System.out.println("---------------------------------------------");
        // weapons 要統一發射武器
        for(Weapon w : weapons){
            w.shoot();
        }
        System.out.println("---------------------------------------------");
        //cars 要統一發射武器(Java8)
        Arrays.stream(cars)
                .filter(c -> c instanceof Weapon)//不同類別,需過慮,過濾後還是cars陣列,需轉換
                .map(c -> (Weapon)c)//cars陣列的內容不變,只是轉型成為weapon陣列! map是轉型關鍵字
                .forEach(c -> c.shoot());
        System.out.println("---------------------------------------------");        
        //weapons 要統一發射武器(Java8)
        Arrays.stream(weapons).forEach(w -> w.shoot());
        
        
    }
}
