package OOPS;
class Animalll {
    String color;
    int leg;

    public void isEat() {
        System.out.println("They eat");
    }

    public void isBreadth() {
        System.out.println("they can breadth");
    }
}
    //Deieved class
    class Fishh extends Animalll{
        public void isSwim(){
            System.out.println("they can swim");
        }
    }
    class sark extends Fishh{
        int size;
        public void isEatSmlFish(){
            System.out.println("yes they eat small fish");
        }
    }
    class tuna extends Fishh{
    public void abtTuna(){
        System.out.println("this is about tuna fish");
    }
    }
//derieved class 2
class birdd extends Animalll{
    public void isfly(){
        System.out.println("they can fly");
    }
}
class peacock extends birdd{
    public void isBeautiful(){
        System.out.println("yes beautiful");
    }
}
class MAmals extends Animalll{
    public void isWalk(){
        System.out.println("yes they can walk");
    }
}
class cat extends MAmals{
    public void isMoun(){
        System.out.println("their voice is mounn");
    }
}
class human extends MAmals{
    public void isIntelligent(){
        System.out.println("human are intelligent");
    }
}
class doog extends MAmals{
    public void isBark(){
        System.out.println("they barking");
    }
}
public class Hybrid_Inheritance {
    public static void main(String[] args) {
        dog d1=new dog();
        d1.color="BLUE";
        System.out.println(d1.color);
    }
}
