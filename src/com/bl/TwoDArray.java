package com.bl;

public class TwoDArray {
    public static void main(String[] args) {
//       int[][] arr = new int[3][4];
//        dataType arr = new int [row][column]
          int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//          System.out.println(arr[1][0]);
          for(int i=0; i<arr.length ; i++){
             for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
             }
             System.out.println();
          }
//          for (int i=0;i<11;i++)
//             System.out.print(" "+i);


    }
}
