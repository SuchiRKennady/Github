package com.bl.assign;

import java.util.Scanner;

public class ArraySmall {
    public static void main(String[] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the array length");
//        n = sc.nextInt();
        int[] arr = new int[]{23,34,45,56,67};
        System.out.println("Enter the elements of array");
//        for (int i=0; i<n; i++) {
//            arr[i] = sc.nextInt();
//        }
        int small = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("largest element is : "+small);
    }

}
