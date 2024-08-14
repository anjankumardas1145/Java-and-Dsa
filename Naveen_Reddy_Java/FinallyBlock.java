package Naveen_Reddy_Java;

public class FinallyBlock {
    public static void main(String[] args) {
        int arr[]=new int[6];
        System.out.println("Jay Jagannath");
        try{
            System.out.println(arr[43]);
            //here exception occour if and there is no catch block to catch the exception,that means java catch the exception but still finally block will be executed
        }finally {
            int a=9,b=8;
            int sum=a+b;
            System.out.println(sum);

        }
        try{
            System.out.println(5/0);
            //here also no catch block to catch the exception
        }
        finally{
            int fact=1;
            for (int i=1;i<=5;i++){
                fact=fact*i;
            }
            System.out.println("factorial of the number is "+fact);
        }
        System.out.println("Jay shree Ram");
    }
}
