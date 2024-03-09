package JAVA_FUNDAMENTAL.OPERATOR;

import java.util.Scanner;

public class logical_operator {
    //first understand why the concept of logical operator comes to exixtance
    // for example there is a condition that if your age is <5,then you will get 75% discount
    // age>60,then you will get 25% discount
    //if you are a female then you will get 50% discount
    //THINK what will be the discount if someone is female and her Age is less then..<5 ..then the discount will be 50% how can you calculate
    // think someone is female and her age is >60 what will be the discount......discount will be 75%......
    // THESE ARE THE SOME SITUATION WHERE LOGICAL OPERATER COME INTO EXITANCE

    //condition
    //age<5:75% discount
    //age>60:25%
    //female.50%
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age:");
        int age = sc.nextInt();
        System.out.print("are you a female? (true/false)");
        boolean isfemale = sc.nextBoolean();
        if (age < 5) {
            System.out.println("you gpt 75% discount");
        } else if (age > 60&& !isfemale) {
            System.out.println("you got 25% discount");
        } else if (isfemale) {
            System.out.println("you got 50% discount");
        }

    }
}