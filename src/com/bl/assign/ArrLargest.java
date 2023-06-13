package com.bl.assign;

import java.util.Scanner;

public class ArrLargest {
    public static void main(String[] args) {
//        int[] arr = new int[] {25,55,77,45};
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length");
        n = sc.nextInt();
        int[] arr = new int[20];
        System.out.println("Enter the elements of array");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int lar = arr[0];
        for(int i=0; i<arr.length; i++){
           if(arr[i]>lar){
               lar = arr[i];
           }
        }
        System.out.println("largest element is : "+lar);
    }
}
