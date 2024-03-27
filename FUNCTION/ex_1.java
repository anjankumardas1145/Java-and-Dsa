package FUNCTION;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
   printFirstPattern();
  printSecond();
printThirdPattern();
        invertedHalfPyramid();
    }
  public static void printFirstPattern(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");}
                System.out.println(" ");
            }
        }
        public static void printSecond(){
            for (int i=1;i<=5;i++){
                for (int j=i;j<=5;j++){
                    System.out.print("*");}
                System.out.println(" ");
            }
        }
    public static void printThirdPattern(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");}
            System.out.println(" ");
        }
    }
    public static void invertedHalfPyramid(){
        int n=5;
        for (int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( " ");
        }
    }

        }


