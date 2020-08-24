package com.pcschool.ocp.d11_group.case1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {//key值是一個LeveL的物件
    public static void main(String[] args) {
        Map<Level, String> scores = new TreeMap<>();
        scores.put(new Level(90, "A"), "John");
        scores.put(new Level(70, "C"), "Mary");
        scores.put(new Level(80, "C"), "Helen");
        System.out.println(scores);
    }
}
