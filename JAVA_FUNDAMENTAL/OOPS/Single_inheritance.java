package JAVA_FUNDAMENTAL.OOPS;
class Animal{
    String name;
    public void eat(){
        System.out.println("the animal is eating:");
    }
    public void sleep(){
        System.out.println("the animal is sleeping");
    }
}
class fish extends Animal{
    int fins;
    public void swim(){
        System.out.println("the fish is come from pakistan be carefull");
    }
}
public class Single_inheritance {
    public static void main(String[] args) {
fish chingudi=new fish();
chingudi.eat();
chingudi.swim();
    }
}
