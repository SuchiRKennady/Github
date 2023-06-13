package com.bl.DataStack;

public class Stack {
    static int[] stack = new int[5];
    static int top = 0;
    public static void push(int data){
        stack[top] = data;
        top++;
    }
    public static void show(){
        for (int n: stack) {
            System.out.println(n);
        }
    }

    public int peek(){
        int data;
        data = stack[top -1];
        return data;
    }

    public static int size(){
        return top;
    }

    public static boolean isEmpty(){
        return top<=0;
    }
}
