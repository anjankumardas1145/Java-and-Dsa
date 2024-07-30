package Naveen_Reddy_Java;

import javax.management.MBeanAttributeInfo;

class A{
public A(){
    System.out.println("Iam A Constructor");
}
public A(int n){
    System.out.println("Iam A's Parameterised Constructor.");
}

}
class B extends A{
    public B(){
        System.out.println("Iam B");
    }
    public B(int n){
        super(n);

        System.out.println("Iam a parameterised Constructor");

    }


}
public class Super_ {
    public static void main(String[] args) {
        B b1=new B( 8);
        B b2=new B();
    }


}
