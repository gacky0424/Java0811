package com.pcschool.ocp.d06.case3.material;

public class Pearl extends Material {
 
	private String size;

    public Pearl() {
        this("L");//建構子調用
    }

    public Pearl(String size) {
        setName("珍珠");
        setSize(size);
        setPrice();
    }
    
    //超載方法Overloading
    public void setPrice(){
        if (size.equalsIgnoreCase("L")){
            setPrice(40);
        }else{
            setPrice(20);
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
	 
}
 
