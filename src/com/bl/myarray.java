package com.bl;
import java.util.Scanner;
public class myarray {
    public static void main(String[] args) {
//        int[] myarray = new int[5];
//        //    datatype[] arraysums = new datatype [size];
//        int a = {11,12,13,14,15};
////        myarray[0] = 12;
////        myarray[1] = 13;
////        myarray[2] = 14;
////        myarray[3] = 15;
//       System.out.println(a[0]);
////        System.out.println(myarray[3]);
//        //System.out.println(myarray[a. - 1]);
//        //for (int i : myarray) {
//        //if (i % 2 == 0) {
//        //System.out.println(i);
//        int[] arr = {12,13,14,15,16};
//        System.out.println(arr[2]);
//        int arrlenght = arr.length;
//        System.out.println("the lenght:"+ arrlenght);
//        for (int i = 0 ; i <arr.length ; i++){
//            //System.out.println(arr[i]+"");
//            if(i % 2 == 0){
//                System.out.println(arr[i]);
//
//            }
//        }
//        int sum = 0;
//        sum = arr[1] + sum  ;
//        System.out.println(sum);
        //Prime numbers
        int prime;

        System.out.println("prime numbers");
        for (int i = 2; i <= 50; ++i) {
            prime=0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime++;
                    break;
                }
            }
            if (prime == 0)
                System.out.println(" "+i);
        }

//        int[] arr = new int[5];
//        System.out.println("enter the array");
//        for (int i=0; i<arr[5]; i++){
//            System.out.println(" "+arr[i]);
//        }

        int[] arr={1,2,3,4};


    }
}
