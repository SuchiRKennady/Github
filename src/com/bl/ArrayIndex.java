package com.bl;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class ArrayIndex {
    public static int main(String[] args) {
        int t=0;
        int[] arr = new int[]{40,60,89,55,75,32,12,15};
        int len = arr.length;
        int i = 0;
        while(i<len){
            if(arr[i]==t){
                return i;
            }
            else {
                i=i-1;
            }
        }
        return 1;



    }
}
