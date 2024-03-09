package Conditional_Statementt;

import java.util.Scanner;
//find the number of days in a month
public class calulate_the_no_of_Days_in_a_month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of month:");
        int month= sc.nextInt();
        System.out.println("enter the year:");
        int year=sc.nextInt();
        if(month==1){
            System.out.println("in" +year+ "january month has 31 days");
        } else if (month==2){
            if (year%4==0 && year%100!=0 || year%400==0){
                System.out.println("in "+ year +" february has 29 days");
            }else{
                System.out.println("in "+ year +" february has 28 days");
            }

        }
        else if (month==3){
            System.out.println("in"+ year + "march has 31 days");
        } else if (month==4) {
            System.out.println("in"+ year + "April has 30 days");
        }
        else if (month==5){
            System.out.println("in"+ year + "may has 31 days");
        } else if (month==6) {
            System.out.println("in"+ year + "june has 30 days");
        } else if (month==7) {
            System.out.println("in"+ year + "july has 31 days");
        } else if (month==8) {
            System.out.println("in"+ year + "august has 31 days");
        } else if (month==9) {
            System.out.println("in"+ year + "september has 30 days");
        } else if (month==10) {
            System.out.println("in"+ year + "october has 31 days");
        } else if (month==11) {
            System.out.println("in" + year + "november has 30 days");
        } else if (month==12) {
            System.out.println("in"+ year + "december has 31 days");
        }
        else {
            System.out.println("this is not a valid month" );
        }
    }
}
