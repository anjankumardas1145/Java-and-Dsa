package IMPORTANT_;

import java.util.Scanner;

public class Calculate_the_number_of_days_in_the_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month_name = "null    ";
        int num_of_day_in_thr_month = 0;
        System.out.println("enter the number of month:");
        int month = sc.nextInt();
        System.out.println("enter the year:");
        int year = sc.nextInt();
        switch (month) {
            case 1:
                month_name = "january";
                num_of_day_in_thr_month = 31;

                System.out.println( "in  "+year+ " " +month_name+"  has  "+num_of_day_in_thr_month+  " days");
                break;

            case 2:
                month_name = "february";
                if((year%400==0)||((year%4==0)&&(year%100!=0))){
                    num_of_day_in_thr_month=29;
                    System.out.println("in  "+year+ " "+month_name+"  has " +num_of_day_in_thr_month+" days");
                }else{
                    num_of_day_in_thr_month=28;
                    System.out.println("in  "+year+ " "+month_name+"  has " +num_of_day_in_thr_month+" days" );
                }
                break;
            case 3:
                month_name="march";
                num_of_day_in_thr_month=31;
                System.out.println("in  "+year+ " "+month_name+" has " +num_of_day_in_thr_month+" days");
break;
            case 4:
                month_name="april";
                num_of_day_in_thr_month=30;
                System.out.println( "in  "+year+ " "+month_name+" has " +num_of_day_in_thr_month+" days");
                break;
            case 5:
                month_name="May";
                num_of_day_in_thr_month=31;
                System.out.println( "in  "+year+ " "+month_name+" has " +num_of_day_in_thr_month+" days");
                break;
            case 6:
                month_name="june";
                num_of_day_in_thr_month=30;
                System.out.println( "in  "+year+ " "+month_name+" has " +num_of_day_in_thr_month+" days");
                break;
            case 7:
                month_name="july";
                num_of_day_in_thr_month=31;
                System.out.println( "in  "+year+ " "+month_name+" has " +num_of_day_in_thr_month+" days");
                break;
            case 8:
                month_name="august";
                num_of_day_in_thr_month=31;
                System.out.println( "in  "+year+ " "+month_name+" has " +num_of_day_in_thr_month+" days");
                break;
            case 9:
                month_name="september";
                num_of_day_in_thr_month=30;
                System.out.println("in  "+year+ " "+month_name+" has " +num_of_day_in_thr_month+" days");
                break;
            case 10:
                month_name="october";
                num_of_day_in_thr_month=31;
                System.out.println("in  "+year+ " "+month_name+" has " +num_of_day_in_thr_month+" days");
                break;
            case 11:
                month_name="november";
                num_of_day_in_thr_month=30;
                System.out.println("in  "+year+ " "+month_name+" has " +num_of_day_in_thr_month+" days");
            case 12:
                month_name="december";
                num_of_day_in_thr_month=31;
                System.out.println("in  "+year+ " "+month_name+" has " +num_of_day_in_thr_month+" days");
                break;
            default:
                System.out.println("this is not a month");
        }
    }
}