package IMPORTANT_;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        //int reverse = reverse(num);
        boolean ans=isPalindrome(num);
        if (ans){
            System.out.println("the number "+num+" is palindrome");
        }else{
            System.out.println("the number "+num+" is not palindrome");
        }
    }

        public static boolean isPalindrome( int num){
            int result = reverse(num);
            //OR
 /*       if (result == num) {
               System.out.println("palindrome");
           } else {
              System.out.println("not palindrome");
//            }*/
            //ORR
            return num==reverse(num);
        }

        public static int reverse(int num){
            int ans = 0;
            while (num > 0) {
                int lastDigit = num % 10;
                ans = 10 * ans + lastDigit;
                num /= 10;
            }
            return ans;
        }
    }
