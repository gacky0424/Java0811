package com.pcschool.ocp.d07.case1.food;

import com.pcschool.ocp.d07.case1.material.Egg;
import com.pcschool.ocp.d07.case1.material.Ham;
import com.pcschool.ocp.d07.case1.material.Material;

public class Sandwich extends Food {

    public Sandwich() {
        Ham ham = new Ham();
        Egg egg = new Egg();
        addMaterial(ham);addMaterial(egg);
    }

    public Sandwich(String name) {
        //定義名稱
        super(name);
        //定義食材
        Material[] materials = new Material[2];
        materials[0] = new Ham();
        materials[1] = new Egg();
        setMaterials(materials);//設定食材
    }
}
 
