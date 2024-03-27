package USBM;

import java.util.Scanner;

public class Discount {
    int costPrice;
    String name;
    double dc;
    double amt;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the custumer:");
        name= sc.nextLine();
        System.out.println("enter the cost price");
        costPrice= sc.nextInt();
    }
    void cal() {
        if (costPrice <= 5000) {
            dc = 0;
        } else if (costPrice <= 10000) {
            dc = 0.1 * costPrice;
        } else if (costPrice <= 15000) {
            dc = 0.15 * costPrice;
        } else {
            dc = 0.2 * costPrice;
        }
        amt = costPrice - dc;
    }
        public void display(){
            System.out.println("the custumer name is:"+name);
            System.out.println("costPrice of the article is:"+ costPrice);
            System.out.println("the discount is:" +dc);
            System.out.println("amount you have to paid:"+amt);
        }

    public static void main(String[] args) {
        Discount forMe=new Discount();
        forMe.input();
        forMe.cal();
        forMe.display();


    }
}
