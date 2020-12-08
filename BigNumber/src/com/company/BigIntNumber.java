package com.company;

public class BigIntNumber {
    private int size;
    private int[] number;
    private String[] numberString;

    public BigIntNumber(int size) {
        this.size = size;
        this.number = new int[size];
    }

    public BigIntNumber(String number) {
        this.size = number.length();
        this.number = new int[number.length()];
        this.numberString = number.split("");
        this.insertNumber();
    }

    public int getSize() {
        return size;
    }

    private void insertNumber() {
        for (int i = 0; i < numberString.length; i++) {
            this.number[i] = Integer.parseInt(numberString[i]);
        }
    }

    public int getIndexNumber(int index) {
        return this.number[index];
    }

    public void setIndexNumber(int index, int data) {
        this.number[index] = data;
    }

    public static BigIntNumber add(BigIntNumber n1, BigIntNumber n2) {
        int max = Math.max(n1.size, n2.size);
        BigIntNumber result = new BigIntNumber(max + 1);
        int carry = 0, i = 1, n = max;
        int sum = 0;
        while (n > 0) {
            sum = n1.getIndexNumber(max - i) + n2.getIndexNumber(max - i) + carry;
            result.setIndexNumber(max + 1 - i, (sum % 10));
            carry = sum / 10;
            i++;
            n--;
        }
        if (carry != 0) {
            result.setIndexNumber(max + 1 - i, carry);
        }
        return result;
    }

    public void print() {
        for (int i : this.number
        ) {
            System.out.print(i);
        }
    }
}
