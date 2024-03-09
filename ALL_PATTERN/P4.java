package ALL_PATTERN;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter tthe value of a:");
        int a = sc.nextInt();
//FOR OUTER LOOP
        for (int i=1;i<=a;i++){
            for (int j=1;j<a-i;j++){
                System.out.print(" ");
            }
            ////FOR STARS
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}