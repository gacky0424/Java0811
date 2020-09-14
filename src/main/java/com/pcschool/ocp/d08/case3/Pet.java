package com.pcschool.ocp.d08.case3;
/*Java不允許多繼承,不過利用介面可傭有多繼承的效果*/
public interface Pet {
 
	public static final int legs = 4;
	//介面的方法都是抽象方法,不行有實作內容(主要目的是提供給子類別擴充效果?) 
	public abstract void eat(); 
        
	public abstract void skill();
}
/*介面有一個很重要的特徵是利用它來收集多個類別，而這些類別彼此可以不用建立任何關聯*/ 
