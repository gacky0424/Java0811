package com.pcschool.ocp.d09.case3;

import java.util.Random;
//比較對象1
class Lotto3{//建立一般外部類別
    public void printNumber3(){
            Random r =new Random();
            System.out.printf("%d\n",new Random().nextInt(10));
        }
}
public class LottoStore {
    //比較對象2
    class lotto2{//建立lotto2內部類別
        public void printNumber2(){
            Random r =new Random();
            System.out.printf("%d\n",new Random().nextInt(10));
        }
    }
    public static void main(String[] args) {
        //使用介面以匿名類別(內部類別)建立物件實例!!
        //簡單講,將建立匿名類別與建立物件的步驟同時一起做
        Lotto one = new Lotto(){//匿名類別 ->目的是減少定義類別(子類別)
            @Override
            public void printNumber() {
                Random r =new Random();
                System.out.printf("%d\n",new Random().nextInt(10));
            }
        };//
        System.out.println("============匿名類別=============");
        one.printNumber();
        System.out.println("===========Lambda語法=============");
        //Lambda
        Lotto lotto = () -> System.out.printf("%d\n",new Random().nextInt(10));
        lotto.printNumber();
        //----------------------------------------------------------------------
        System.out.println("============一般外部類別=============");
        Lotto3 three = new Lotto3();//一般都是先建立類別後建立物件實例,在呼叫物件實例的內容
        three.printNumber3();
        System.out.println("===========一般內部類別============");
        //因為是內部類別,一樣是先建立類別,不過建立物件實例的語法與建立外部類別物件實例不同
        LottoStore lottoStore = new LottoStore();
        LottoStore.lotto2 two = lottoStore.new lotto2();
        two.printNumber2();   
    }
}
/*
看到 new 就會以為只是在類別裡建立物件實例,不過要注意語法!!

介面(類別) 物件參考變數 = new 建構子(){
    //內容
};

這個語法是建立匿名類別物件實例的語法,是一個內部類別,因為沒有類別名稱之所以被稱為匿名類別.
沒有類別名稱,但是生成物件還是需要使用 new 關鍵字,沒有類別名稱怎麼建立物件???
"使用父類別或介面來建構所需要的匿名子類別實例" 目的是減少定義子類別的程序而建立物件實例
建立後的匿名類別實例就會實行並覆寫介面或父類別的內容
*/