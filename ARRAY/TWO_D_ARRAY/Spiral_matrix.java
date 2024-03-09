package ARRAY.TWO_D_ARRAY;

import java.util.Scanner;

public class Spiral_matrix {
    public static void spriral(int arr[][],int r,int c){
        int toprow=0, bottomrow=r-1,leftcol=0,rightcol=c-1;
        int tatalelement=0;
        while(tatalelement<r*c){
            //topRow=leftcol to rightcol
            for (int j=leftcol;j<=rightcol&&tatalelement<r*c;j++){
                System.out.print(arr[toprow][j]+" ");
                tatalelement++;
            }
            toprow++;
            //rightcol=toprow to bottom row
            for (int i=toprow;i<=bottomrow&& tatalelement<r*c;i++){
                System.out.print(arr[i][rightcol]+" ");
                tatalelement++;
            }
            rightcol--;
            //bottomrow=rightcol toleftcolumn
            for (int i=rightcol;i>=leftcol&&tatalelement<r*c;i--){
                System.out.print(arr[bottomrow][i]+" ");
                tatalelement++;
            }
            bottomrow--;
                    //leftcol=bottomrow to top row
            for(int i=bottomrow;i>=toprow&&tatalelement<r*c;i--){
                System.out.print(arr[i][leftcol]+" ");
                tatalelement++;
            }
            leftcol++;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row:");
        int r=sc.nextInt();
        System.out.println("enter the column");
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter "+r*c+" element into the array");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        spriral(arr,r,c);

    }

}
