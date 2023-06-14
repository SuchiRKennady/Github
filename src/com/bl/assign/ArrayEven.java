package com.bl.assign;

import java.util.Scanner;

public class ArrayEven {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length");
        n = sc.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter the elements of array");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are");
        for (int i=0; i<n; i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("print odd elements : ");
        for (int i=0; i<n; i++){
            if(arr[i]%2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
