package OOPS;

public class multi_level_inheritance {
    public static void main(String[] args) {
Animal a1=new Animal();
a1.color="red";
Dog D1=new Dog();
D1.color="black";
        System.out.println(D1.color+ " ,"+a1.color);
D1.eat();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breadth(){
        System.out.println("breadth");
    }
}
//derived class
class Mamal extends Animal{
    int legs;
}
class Dog extends Mamal{
    String breed;
   public void isBark(){
       System.out.println("they bark");
   }
}