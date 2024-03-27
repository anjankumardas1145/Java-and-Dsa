package OOPS;
class Animall{
    String color;
    int weight;
    public void breadth() {
        System.out.println("they breadth");
    }
    public void isEat(){
        System.out.println("they eat");
    }
}
class bird extends Animall{
    public void isFly(){
        System.out.println("they fly");
    }
}
class Fish extends Animall{
    public void isSwim(){
        System.out.println("they can swim");
    }
}
class Mamals extends Animall{
    public void isWalk(){
        System.out.println("they walk");
    }
}
public class Hierarchical_inheritance {
    public static void main(String[] args) {
        Mamals Human=new Mamals();
        Human.color="BLACK/WHITE";
        bird peacock=new bird();
        peacock.weight=5;
        Fish sark=new Fish();
        sark.isSwim();
        System.out.println(Human.color+ " ,"+peacock.weight);
    }
}
