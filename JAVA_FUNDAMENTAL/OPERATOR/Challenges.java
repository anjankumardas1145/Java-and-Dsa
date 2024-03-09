package JAVA_FUNDAMENTAL.OPERATOR;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Challenges {
    public static void main(String[] args) {
        //Positive or negative
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number:");
//        int num=sc.nextInt();
//        if(num>=0){
//            System.out.println("positive number");
//        }else{
//            System.out.println("negstive number");
//        }
        //even number/odd number


//        Scanner sc=new Scanner(System.in);
//        System.out.print("enter the number:");
//        int num=sc.nextInt();
//        if(num%2==0){
//            System.out.println(num + " even number");
//        }else{
//            System.out.println(num+ " odd number");
//        }

        //Leap year
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the your:");
//        int year=sc.nextInt();
//        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
//            System.out.println("Leap year");
//        }else{
//            System.out.println("not a leap year");
//        }

        //greatest number

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter three number:");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        if (a>b&&a>c){
//            System.out.println("a is greatest");
//        } else if (b>c && b>a) {
//            System.out.println(" b is greatest");
//        }else{
//            System.out.println("c is greatest");
//        }
//Create a program that calculates grades based on marks
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks: ");
        System.out.print("enter your mil marks:");
        int mil = sc.nextInt();
        System.out.println("enter your eng marks:");
        int eng = sc.nextInt();
        System.out.println("enter your math mark:");
        int math = sc.nextInt();
        System.out.println("enter your phy mark:");
        int phy = sc.nextInt();
        System.out.println("enter your chem marks:");
        int chem = sc.nextInt();
        System.out.println("enter your IT marks:");
        int IT = sc.nextInt();
        double totalMarks = 0;
        totalMarks = (mil + eng + math + phy + chem + IT);

        System.out.println(totalMarks);
        float percent = (float) totalMarks / 600 * 100;
            if(percent>=90){
                System.out.println("A");
            } else if (percent>=75) {
                System.out.println("B");
            }else if(percent>=60){
                System.out.println("C");
            } else if (percent>=40) {
                System.out.println("D");
            }
            else {
                System.out.println("fAIL");
            }
    }
}