package JAVA_FUNDAMENTAL.OPERATOR;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number:");
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int sum=a+b;
//        int sub=a-b;
//        int mul=a*b;
//        int div=a/b;
//        System.out.println("sum is" + sum);
//        System.out.println("sub is:"+sub);
//        System.out.println("mul is:"+mul);
//        System.out.println("division is:"+div);

        //Q2:

        //create a program to calculate product of two floatig point number

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter two floaating point number:");
//        float f1= sc.nextFloat();
//        float f2=sc.nextFloat();
//         float product=f1*f2;
//        System.out.println("the product of the number is:"+product);

        //Q3:
        //calculate perimeter of a rectangle
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the length of the rectangle:");
//        int length=sc.nextInt();
//        System.out.println("enter the breth of the rectangle");
//        int breath=sc.nextInt();
//        int perimeter=2*(length+breath);
//        System.out.println("the perimeter of the rectangle is:"+perimeter);

        //Q4
        //area of a triangle
//                Scanner sc=new Scanner(System.in);
//        System.out.println("enter the base of the triangle in cm:");
//        double base=sc.nextDouble();
//        System.out.println("enter the height of the triangle in cm");
//        double height=sc.nextDouble();
//
//        double area=0.5*base*height;
//        System.out.println(area);


        //Q5:
        //simple interest
//        Scanner sc=new Scanner (System.in);
//        System.out.println("enter your principle amount:");
//        int principle=sc.nextInt();
//        System.out.println("enter your time period:");
//        float year= sc.nextFloat();
//        System.out.println("enter the rate of interest:");
//        float rate=sc.nextFloat();
//        float si=(principle*year*rate)/100;
//        System.out.println(si);

        //Q5:Compound INtrest
//        Scanner sc=new Scanner (System.in);
//       System.out.println("enter your principle amount:");
//       int principle=sc.nextInt();
//        System.out.println("enter your time period:");
//       float year= sc.nextFloat();
//       System.out.println("enter the rate of interest:");
//        float rate=sc.nextFloat();
//        double comInt=principle*Math.pow((1+rate/100),year);
//        System.out.println("the compund interest will be:"+comInt);

        //Q6:farenheit to celcius
//        Scanner sc=new Scanner(System.in);
//        System.out.println("welcome to the farenheit calculator:");
//        System.out.println("enter the temperature in ferinheit:");
//        float feh=sc.nextFloat();
//        float cel=(feh-32)*5/9;
//        System.out.println("your temperatue is "+ cel+" C");


        //ask the user wheather they want to calculate simple interest or compount interest
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your principle amount:");
     int principle=sc.nextInt();
     System.out.println("enter your time period:");
      float year= sc.nextFloat();
      System.out.println("enter the rate of interest:");
       float rate=sc.nextFloat();

        System.out.println("enter the character:");
        char ch=sc.next().charAt(0);
//        char chh=sc.next().charAt(0);
        if (ch=='s'){
            float si=(principle*year*rate)/100;
        System.out.println(si);
        }
        else if(ch=='c'){
            double comInt=principle*Math.pow((1+rate/100),year);
        System.out.println("the compund interest will be:"+comInt);
        }
   }
}
