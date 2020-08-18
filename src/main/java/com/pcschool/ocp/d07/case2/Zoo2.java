package com.pcschool.ocp.d07.case2;

public class Zoo2 {
    public static void main(String[] args) {
        Animal animal1 = new Fish();
        Animal animal2 = new Penguin();
        if(animal1 instanceof Bird){
            ((Bird)animal1).move();//Fish屬於動物,但不屬於 Bird,不可轉型成Bird
        } else {
            System.out.println("Fish不可轉換成Bird");
        }
        ((Bird)animal2).move();
    }
}
