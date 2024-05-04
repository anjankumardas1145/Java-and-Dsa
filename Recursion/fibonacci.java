package Recursion;

public class fibonacci {
    public static int fab(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fab(n - 1) + fab(n - 2);
        }
    }

        public static void main (String[]args){
int b=5;
            System.out.println(fab(b));
        }
    }

