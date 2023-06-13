package com.bl.encapsulation;

public class MainEmcaps {
    public static void main(String[] args) {
        Encapsulation acc = new Encapsulation();
        acc.setAccNo(123);
        acc.setName("Suchitra");
        System.out.println(acc.getAccNo());
        System.out.println(acc.getName());
    }
}
