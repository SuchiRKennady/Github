package com.bl.assign;

import java.util.Scanner;

public class Array {
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
            System.out.println(arr[i]);
        }
    }
}
