package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Queue queue = new Queue(10);
        queue.enqueue(10);
        queue.enqueue(2);
        queue.enqueue(120);
        queue.enqueue(100);
        queue.enqueue(105);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.enqueue(10000);
        queue.enqueue(10000);
        System.out.println(queue);
        queue.enqueue(20000);
        queue.enqueue(30000);
        queue.enqueue(40000);
        System.out.println(queue);
    }
}
