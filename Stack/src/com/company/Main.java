package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(6);
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.pop();
        stack.peek();
        stack.pop();
        System.out.println(stack);
    }
}
