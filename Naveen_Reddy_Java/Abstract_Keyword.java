package Naveen_Reddy_Java;
 abstract class Car{
  public   abstract void drive();

  public void playMusic(){
      System.out.println("Driving with music is amazing");
  }
}
class Audi extends Car{
     public void drive(){
         System.out.println("I can drive Audi");
     }
     public void speedHigh(){
         System.out.println("Speed of Audi is high");
     }

}
public class Abstract_Keyword {
    public static void main(String[] args) {
      Audi A1=new Audi();
      A1.playMusic();
      A1.speedHigh();
      A1.drive();
    }
}
//an abstract method must need the abstract class but an abstract class is not must contain any abstract method