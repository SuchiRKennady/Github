package com.bl.DataStack;

public class MainStack {
    public static void main(String[] args) {
        Stack demoStack = new Stack();
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);

        Stack.show();

// System.out.println(Stack.peek());
        System.out.println(Stack.size());

        System.out.println(Stack.isEmpty());

    }
}
