
package com.pcschool.ocb.d01;


public class BMIstore {
    public static void main(String[] args) {
        BMI b1 = new BMI();
        b1.name="John";b1.h=170;b1.w=60;
        b1.bmi=b1.w/Math.pow(b1.h/100, 2);
    
        BMI b2 = new BMI();
        b2.name="Mary";b2.h=165;b2.w=45;
        b2.bmi=b2.w/Math.pow(b2.h/100, 2);
        
        System.out.printf("%s bmi=%.2f\n",b1.name,b1.bmi);
        System.out.printf("%s bmi=%.2f\n",b2.name,b2.bmi);

    }
    
}
