package com.bl.FunctionalInterface;

public class Main {
    public static void main(String[] args) {
//        Greeting hi = new Greeting() {
//            @FunctionalInterface
//            @Override
//            public void greet(){
//                System.out.println("good morning");
//        Greeting h1 = ()->{
//            System.out.println("Good Morning");
//            };
//        h1.greet();
        Addition addition = (int a, int b) -> a+b;
        int result = addition.add(7, 3);
        System.out.println(result);

        Subtraction subtraction = (int a,int b) -> a-b;
        System.out.println(subtraction.sub(15, 5));
    }
}

