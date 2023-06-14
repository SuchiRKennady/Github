package com.bl.MyConstructor;

public class MyConstructor {
    String name;
    int age;


    public MyConstructor() {
        System.out.println("calling constructor");
    }

    public MyConstructor(String name, int age) {
        System.out.println("calling constructor");
        this.name = name;
        this.age = age;
    }

    public MyConstructor(String name) {
        this.name = name;
    }

    public MyConstructor(int age) {
        this.age = age;
    }

    public void myMethod(){
        System.out.println("calliing method");
    }
}

