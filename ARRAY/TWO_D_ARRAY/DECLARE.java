package ARRAY.TWO_D_ARRAY;

import java.util.Scanner;

public class DECLARE {
    public static void TDAR(int arr[][]){//TDAR means 2-D arrays

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         //int[][] arr=new int[][];
         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
TDAR(arr);
    }
}
