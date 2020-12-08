package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BigIntNumber n1 = new BigIntNumber("80");
        BigIntNumber n2 = new BigIntNumber("80");
        BigIntNumber result=(BigIntNumber.add(n1, n2));
        result.print();
//        n1.print();
    }
}
