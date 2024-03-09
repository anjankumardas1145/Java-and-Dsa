import java.util.Scanner;

public class Quadartic_Equation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input a:");
        double a= sc.nextDouble();
        System.out.println("input b:");
        double b= sc.nextDouble();
        System.out.println("input c:");
        double c=sc.nextDouble();
        double result=b*b-4.0*a*c;
        if (result>0.0){
            double r1=(-b+Math.pow(result,0.5))/(2.0*a);
            double r2=(-b-Math.pow(result,0.5))/(2.0*a);
            System.out.println("the roots are"+r1+"and"+r2 );
        } else if (result == 0.0) {

            double r1=-b/(2.0*a);
            System.out.println("the root is "+r1);
        }else {
            System.out.println("the equation has no root");
        }
    }
}
