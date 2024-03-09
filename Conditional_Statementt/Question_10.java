package Conditional_Statementt;
import java.util.Scanner;
public class Question_10 {




//input:1234
    //output:1
            //2
            //3
             //4

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int num=sc.nextInt();
            int temp=num;
            int rev=1;

            while(temp/rev>0) {
                rev=rev*10;



            }
            while(rev>1) {
                rev=rev/10;
                int digit=(num/rev)%10;
                System.out.println(digit);
            }




        }

    }

