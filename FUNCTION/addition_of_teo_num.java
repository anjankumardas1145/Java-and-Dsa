package FUNCTION;

import java.util.Scanner;

class Addition{
    int add(int a,int b) {
        int ans = a + b;
        return ans;
    }
}
public class addition_of_teo_num {
    public static void main(String[] args) {
        Addition ob1=new Addition();//0b1=object name
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

       int ans= ob1.add(a,b);
        System.out.println("the ans will be:"+ans);
    }

}
