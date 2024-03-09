import java.util.Scanner;

public class positive_negative_Or_ZEro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        if (a==0){
            System.out.println("the number is zero");
        } else if (a>0) {
            System.out.println("the number is positive");
        }
        else {
            System.out.println("the number is negative");
        }
    }
}
