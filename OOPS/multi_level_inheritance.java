package OOPS;

public class multi_level_inheritance {
    public static void main(String[] args) {
anjan a1=new anjan();
a1.color="red";
dog D1=new dog();
D1.color="black";
        System.out.println(D1.color+ " ,"+a1.color);
D1.eat();
    }
}
class anjan{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breadth(){
        System.out.println("breadth");
    }
}
//derived class
class Mamal extends anjan {
    int legs;
}
class dog extends Mamal{
    String breed;
   public void isBark(){
       System.out.println("they bark");
   }
}