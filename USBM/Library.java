package USBM;

import java.util.Scanner;

public class Library {
    int acc_num;
    String title;
    String Auther;
   public void input(){
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter your accession number:");
        acc_num=sc.nextInt();
        sc.nextLine();
       System.out.println("enter your book auther name:");
       Auther=sc.nextLine();
        System.out.println("enter your book title:");
        title= sc.nextLine();
    }
   public  void compute(int days){
        int fine=days*2;
        System.out.println("the fine you have to pay is:"+fine);
    }
   public  void display(){
       System.out.println("the accesssion number is:"+acc_num);
       System.out.println("the book title is:"+title);
       System.out.println("the auther name is:"+Auther);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the USBM library");
        Library usbm=new Library();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the delay in, days");
        int day= sc.nextInt();
      usbm.input();
        usbm.compute(day);
        usbm.display();

    }
}
