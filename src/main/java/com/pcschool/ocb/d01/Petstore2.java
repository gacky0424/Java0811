
package com.pcschool.ocb.d01;

public class Petstore2 {
    public static void main(String[] args) {
        Cat d1 = new Cat();
        Cat d2 = new Cat();
        //d1,d2,d3資料設定
        Cat.type = "波斯貓";
        d1.name="小花"; d1.age = 2;d1.price = 12000;d1.amount = 8;
        d2.name="柯南"; d2.age = 7;d2.price = 500  ;d2.amount = 5;
        // 資料印出
        System.out.printf("品種: %s 名字: %s 年齡: %d 價格: %,d 數量: %d 小計: %,d\n",
                          Cat.type, d1.name ,d1.age ,d1.price ,d1.amount,(d1.price*d1.amount));
        System.out.printf("品種: %s 名字: %s 年齡: %d 價格: %,d 數量: %d 小計: %,d\n", 
                          Cat.type, d2.name ,d2.age ,d2.price ,d2.amount,(d2.price*d2.amount));
        //d1,d2的小計總和
        //System.out.printf("Dog 總資產: %d\n",(d1.price*d1.amount)+(d2.price*d2.amount));
        int sum = (d1.price*d1.amount)+(d2.price*d2.amount);
        System.out.printf("小花與柯南們的總資產: %,d\n",sum);
    }
}
