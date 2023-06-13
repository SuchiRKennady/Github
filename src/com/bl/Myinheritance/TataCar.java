package com.bl.Myinheritance;

public class TataCar implements Car {

    @Override
     public void drive() {
        System.out.println("Tata car is a 4 wheel drive");
    }
    @Override
    public void brake(){
        System.out.println("Tata car has good brake system");
    }
    @Override
    public void gearShift(){
        System.out.println("Tata car has smooth gearshift system");
    }
}
