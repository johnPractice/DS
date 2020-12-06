package com.company;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int data) {
        if (data == 0 || data == 1) return 1;
        return data * factorial(data - 1);
    }
}
