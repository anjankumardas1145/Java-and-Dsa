import java.util.Scanner;

public class Greatest_Among_Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three number:");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        if (a>b&&a>c){
            System.out.println(a+"is the greatest number");
        } else if (b>a&&b>c) {
            System.out.println(b+"is greatest number");

        }else {
            System.out.println(""+c+"is greatest number");
        }
    }
}
