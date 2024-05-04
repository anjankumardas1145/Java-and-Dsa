package OOPS;

public class Abstracttion_Example {
    public static void main(String[] args) {
horse h1=new horse();
h1.walk();
h1.eat();
chicken c1=new chicken();
c1.walk();
c1.eat();
    }
}
abstract class aanimalll {
    public void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class horse extends aanimalll{
    @Override
    void walk() {
        System.out.println("walks on four legs");
    }
}
class chicken extends aanimalll{
    @Override
    void walk() {
        System.out.println("walks on two legs");
    }
}