package USBM;

import java.util.Scanner;

class employe{
    int pan;
    String name;
    double taxincome;
    double tax;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your name:");
        name= sc.nextLine();

        System.out.println("Please enter your pan number:");
        pan=sc.nextInt();

        System.out.println("please enter your taxable income:");
        taxincome= sc.nextDouble();
    }
    public void cal(){
        if (taxincome<=250000){
            tax=0;//nothing in
        }else if(taxincome<=500000){
            tax=0.1*(taxincome-250000);//10%=10/100=0.1
            }else if(taxincome<=1000000){
            tax=30000+0.2*(taxincome-500000);//in question given 30000+20%= 30000+(20/100)=30000+0.2
        }else{
            tax=100000+(30/100)*(taxincome-1000000);
        }
        }

    public void display(){
        System.out.println("here the employee details,check it");
        System.out.println("pan number is: "+pan);
        System.out.println("your name is: "+name);
        System.out.println("your tax is:"+tax);
        System.out.println("your annulntaxable income is:"+taxincome);
    }
}
public class EMP {
    public static void main(String[] args) {
        employe e1=new employe();
        e1.input();
        e1.cal();
        e1.display();
    }
}
