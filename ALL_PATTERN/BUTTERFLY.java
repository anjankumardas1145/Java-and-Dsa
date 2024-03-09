package ALL_PATTERN;

import javax.management.MBeanAttributeInfo;

public class BUTTERFLY {
    public static void main(String[] args) {
        int n=4;
        //outer loop
        //first half
        for (int i=1;i<=n;i++){
            //for outer loop
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //another part of the butterfly
        //second half
        for (int i=n;i>=1;i--){
            //star-i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces 2(n-i)
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star-i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
