package com.bl.DataQueue;

public class MyQueue {
    public static void main(String[] args) {
        DataQueue dataqueue = new DataQueue();
        dataqueue.enqueue(10);
        dataqueue.enqueue(20);
        dataqueue.enqueue(30);
        dataqueue.enqueue(40);
//        dataqueue.enqueue(50);

        dataqueue.Display();
    }
}
