package ARRAY.TWO_D_ARRAY;

import java.util.Scanner;

public class INPUT_2D_ARRAY {
    public static void input(int arr[][]) {

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row size:");
        int r = sc.nextInt();
        System.out.println("nter the column size:");
        int c = sc.nextInt();
        //declare the array
        int[][] arr = new int[r][c];
        System.out.println("enter "+r*c+" into the array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }//
        //if you don not use function then use th below code
       /* for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }*/
        input(arr);
    }
}