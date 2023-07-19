package com.bl.DataQueue;

public class DataQueue {
    int[] queue = new int[5];
    int rear;
    int front;
    int size;

    public void enqueue(int data){
        queue[rear] = data;
        rear++;
        size++;
    }
    public int dequeue(){
        int data = queue[front];
        front++;
        size--;
        return data;
    }


    public void Display(){
        for(int i = 0; i<=size-1; i++){
//            System.out.println(queue[i]);
            System.out.println(queue[front]);
//            System.out.println(queue[rear-1]);
        }
    }
}
