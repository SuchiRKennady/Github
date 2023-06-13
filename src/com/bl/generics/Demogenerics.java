package com.bl.generics;

public class Demogenerics {
    public static void main(String[] args) {
        Demogenerics demoGenerics = new Demogenerics();
        demoGenerics.greet("Riya");
        demoGenerics.greet('B');
    }
    public <A>void greet(A name){
        System.out.println("Hello " + name);
    }


}
