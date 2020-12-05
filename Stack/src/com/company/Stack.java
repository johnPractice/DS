package com.company;

public class Stack {
    private int size;
    private int[] stack;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public Stack(int size, int[] stack) {
        this.size = size;
        this.stack = stack;
        this.top = -1;
    }

    public boolean push(int data) {
        if (top > this.stack.length - 1) {
            System.out.println("Stack over flow!!");
            return false;
        }
        top++;
        this.stack[top] = data;
        System.out.println(data + " added to stack");
        return true;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        int result = this.stack[top];
        this.stack[top] = 0;
        top--;
        return result;
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return this.stack[top];
    }

    @Override
    public String toString() {
        String result = "Stack{ ";
        for (int i : this.stack
        ) {
            result = result + i + ',';
        }
        result = result + " }";
        return result;
    }
}
