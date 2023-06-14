package com.bl.oops;

public class Animal {
    static String colour;
    int noOfLegs;
    static void walk(){
        System.out.println("Animal can walk");
    }
    final void eat(){
        System.out.println("Animal can eat");
    }
    public Animal(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public Animal() {
    }
}
