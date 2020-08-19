package com.pcschool.ocp.d08.army;

public class ArmyMain {
    public  ArmyMain(){
        
    }
    public static void main(String[] args){
        Airplane[] airplanes = {new Fighter(), new Fighter(), new Fighter()};//不可輸入抽象類別,
        Car[] cars = {new Tank(), new Truck(), new Truck(), new Tank()};
        Weapon[] weapons = {new Fighter(), new Tank()};
        // cars 統一發射武器
        for(Car car : cars){
            if(car instanceof Tank){
                ((Tank)car).shoot();
            }
        }
        // weapons 要統一發射武器
        for(Weapon w : weapons){
            w.shoot();
        }
    }
}
