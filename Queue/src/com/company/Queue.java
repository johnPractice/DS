package com.company;

public class Queue {
    private int size;
    private int[] queue;
    private int head;
    private int tail;

    public Queue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.head = -1;
        this.tail = -1;
    }

    public Queue(int size, int[] queue) {
        this.size = size;
        this.queue = queue;
        this.head = -1;
        this.tail = -1;
    }

    private boolean isFull() {
        if (this.head == 0 && this.tail == this.size - 1) return true;
        return false;
    }

    private boolean isEmpty() {
        if (this.tail == -1 && this.head == -1) return true;
        return false;
    }

    public boolean enqueue(int data) {
        if (this.isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        if (this.head == -1) this.head = 0;
        this.tail++;
        this.queue[tail] = data;
        System.out.println(data + " added to queue");
        return true;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = this.queue[head];
        this.queue[head] = 0;
        if (this.head > this.tail) {
            this.head = -1;
            this.tail = -1;
        } else this.head++;
        System.out.println(result + " Dequeue");
        return result;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return this.queue[head];
    }

    @Override
    public String toString() {
        String result = "{ ";
        for (int i : this.queue
        ) {
            result = result + i + " , ";
        }
        result = result + " }";
        return result;
    }
}
