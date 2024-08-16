package Naveen_Reddy;

public class generics {
    public static void main(String[] args) {
        Human<Integer> D1=new Human<>(11);
        Human<String> D2=new Human<>("Jay Jagannath");
        Human<String> D3=new Human<>("Ankita");
    }
}
class Human<A>{//basically generics refers that using generics user can put various type of data such as int,string .//this syntax you have to follaw.
    A id;
    Human(A id){
        this.id=id;
        System.out.println(id);
    }
}