package JAVA_FUNDAMENTAL.OPERATOR;
import java.util.Scanner;
public class bitWise_operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        //Bitwise And
        int result=a&b;//t&t=t all other case are false
        System.out.println("result is:"+result);
        //biTwise OR
        int ans =a|b;//f|f=f  all other cases are ture
        System.out.println("the ans is:"+ans);
        //XOR
        int output=a^b;//t^t=f f^f=f all other condition are true
        System.out.println("the output will be:"+output);
        // compliment or Not
        int anss=~a;
        System.out.println("the ans will be:"+anss);
//left shift
        int ansss=a<<2;//out put re 12*2=24,24*2=48..bcz left shift re 2 lekha achi toh 2 times multiplication haba
        System.out.println("the ans is:"+ansss);
        //right shift
        int resultt=7>>2;//12/2=6,6/2=3..total opposite of left shift operator..in case of odd number integer division haba i.e 7>>2...7/2=3,3/2=1(ans)
        System.out.println("result is:"+resultt);
    }
}
