package superKey_Word;
class Animal{
    Animal(){
        System.out.println("anjan");
    }
    Animal(int b){
        System.out.println("B");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("dogggy");
    }
    Dog(int c){
        System.out.println("c");
    }
}
public class test1 {
    public static void main(String[] args) {
        Dog d=new Dog(9);

    }
}
