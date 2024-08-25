import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("is a even number :"+a);
        }else{
            System.out.println( "is a odd number :"+a);
        }
    }
}
