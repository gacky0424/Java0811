package com.pcschool.ocp.d10.case6;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("John");//1
        stack.push("Mary");//2
        stack.push("Helen");//3
        System.out.println("進電梯順序:" + stack);
        System.out.println("出電梯順序:");//3 -> 2 -> 1
        while (!stack.isEmpty()) {
            String name = stack.pop();
            System.out.println(name);            
        }
    }
}
