package com.pcschool.ocp.d09.case6;

public class CarStore {
    public static void main(String[] args) {
        // 透過 Rideable 的 getCar(name)取得 car物件
        Rideable ride1 = new Rideable() {
            @Override
            public Car getCar(String name) {
                Car car = new Car(name);
                return car;
            }
        };
        Car car = ride1.getCar("BMW");
        System.out.println(car);
    
        //lambda
        Rideable ride2 = (name) -> new Car(name);
        Car car2 = ride2.getCar("BMW");
        System.out.println(car2);
        
        // Lambda::
        Rideable ride3 = Car::new;
        System.out.println(ride3);//匿名內部類別,結構長在Lambda裡面
        Car car3 = ride3.getCar("BMW");
        System.out.println(car3);
    }
}
