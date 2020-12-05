package com.company;

public class CircularQueue {
    private int capacity;
    private int[] circularQueue;
    private int rear, front, size;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.circularQueue = new int[capacity];
        front = this.size = 0;
        this.rear = -1;
    }

    public CircularQueue(int capacity, int[] circularQueue) {
        this.capacity = capacity;
        this.circularQueue = circularQueue;
        this.front = 0;
        this.rear = -1;
    }

    public int getRear() {
        return rear;
    }

    public int getFront() {
        return front;
    }

    private boolean isEmpty() {
        return (this.size == 0);
    }

    private boolean isFull() {
        return (this.circularQueue.length == this.size);
    }

    public boolean enqueue(int data) {
        if (this.isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        this.rear = (this.rear + 1)
                % this.capacity;
        this.circularQueue[this.rear] = data;
        this.size = this.size + 1;
        System.out.println(data
                + " enqueued to queue");
        return true;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = this.circularQueue[this.front];
        this.front = (this.front + 1)
                % this.capacity;
        System.out.println(item + "dequeue from Queue");
        this.size = this.size - 1;
        return item;
    }

    @Override
    public String toString() {
        String result = "{ ";
        for (int i : this.circularQueue
        ) {
            result = result + i + " ,";
        }
        return result + " }";
    }
}
