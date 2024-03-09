package ARRAY.TWO_D_ARRAY;

import java.util.Scanner;

public class MULTIPLICATION {
    public static void MUL(int[][] a,int r1,int c1,int[][] b,int c2,int r2){
        if (c1!=r2){
            System.out.println("multiplicat in not possible:");

        }
        int[][] mul=new int[r1][c2];
        for (int i=0;i<r1;i++){//row number
            for (int j=0;j<c2;j++){//column number
                for (int k=0;k<c1;k++){
                   /* mul[i][j]= i th row of a *  j th column of b*/
                    mul[i][j]+=(a[i][k]*b[k][j]);
                }
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and column size:");
        int r1=sc.nextInt();
        int c1= sc.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("input the array:");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the second arryas row and column no");
        int r2= sc.nextInt();

        int c2=sc.nextInt();
        int b[][]=new int[r2][c2];
        System.out.println("input into the array:");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("the sum  is :");


        MUL(a,r1,c1,b,r2,c2);

    }

}
