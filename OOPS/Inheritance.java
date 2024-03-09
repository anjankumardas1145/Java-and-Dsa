package OOPS;

public class Inheritance {
     public  static class animal{
      String name;
      void eat(){
          System.out.println("eats all the grasses");
      }
    }
   public static  class cow extends animal{
        int horns;
        void breed(){
            System.out.println("cow gives us milk");
        }
    }

    public static void main(String[] args) {
        cow c1=new cow();
        c1.eat();

    }
}
