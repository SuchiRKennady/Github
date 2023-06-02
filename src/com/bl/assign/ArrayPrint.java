package com.bl.assign;

import java.util.Scanner;

public class ArrayPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        int num = sc.nextInt();
        int[] arr = new int[20];
        System.out.println("enter the array elements ");
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are");
        for( int i = 0; i < num; i++ ){
            System.out.println(arr[i]);
        }
    }
}
