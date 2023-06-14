package com.bl.oops;

public class Mymain {
    public static void main(String[] args){
        Animal tiger = new Animal(4);
        System.out.println(tiger.noOfLegs);
        tiger.colour = "Yello";
        System.out.println("tiger has yello color" + " "+tiger.colour);

        tiger.walk();

        System.out.println(tiger.noOfLegs);

        tiger.eat();

        tiger.noOfLegs = 4;
        System.out.println(tiger.noOfLegs);

        tiger.walk();

        Tiger.walk();
    }
}
