package com.pcschool.ocp.d07.case2;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.move();
        Animal animal2 = new Bird();//類別繼承動物類別,所以可以使用
        animal2.move();
        Animal animal3 = new Fish();//類別繼承動物類別,所以可以使用
        animal3.move();
        Animal animal4 = new Penguin();//類別繼承動物類別,所以可以使用
        System.out.println("===================================");
        Bird bird = new Bird();
        bird.move();
        Bird bird2 = new Penguin();//類別繼承鳥,所以可以使用
        bird2.move();//實體是Penguin,看實體去執行move
        ((Penguin)bird2).skill();//轉型後可執行Penguin的skill
    }
}
