package ARRAY.TWO_D_ARRAY;

import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter the row size:");
        int r= sc.nextInt();
        System.out.println("enter the column size:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("input the element into the array ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the elements are:");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
               // System.out.print(arr[i][j]+"  ");
                count++;
                System.out.print(count+"   ");
            }
            System.out.println();
        }
    }

    //addition of matrix

  /*  public static void additionMatrix(int a[][],int b[][],int r,int c){
        int ans[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<r;j++){
                ans[i][j]=a[i][j]+b[i][j];
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the row number:");
        int r=sc.nextInt();
        System.out.println("enter the column size:");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter "+r+"x"+c+"element into the array");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int b[][]=new int[r][c];
        System.out.println("enter the "+r+"x"+c+"element into the array");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                b[i][j]=sc.nextInt();


            }
        }
additionMatrix(a,b,r,c);

    }*/
/*public class usbm_lab_practical {

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("enter the row:");
          int r = sc.nextInt();

          System.out.println("enter the column:");
          int c = sc.nextInt();
          int ans = 0;

          int a[][] = new int[r][c];
          for (int i = 0; i < r; i++) {
              for (int j = 0; j < c; j++) {
                  a[i][j] = sc.nextInt();
              }
          }
          int b[][] = new int[r][c];

          for (int i = 0; i < r; i++) {
              for (int j = 0; j < c; j++) {
                  b[i][j] = sc.nextInt();

              }


              for (int p = 0; p < r; p++) {
                  for (int k = 0; k < c; k++) {
                      if (a[p][k] + b[p][k] > a[p + 1][k + 1] + b[p + 1][k + 1]) {
                          ans = a[p][k] + b[p][k];
                          System.out.print(ans + " ");
                      }
                      System.out.println();
                  }
              }
          }
      }*/
  }
