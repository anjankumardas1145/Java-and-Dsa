package Recursion;

public class basic {

    //  Recursion in java is a process in which a method call itself continuously
    //A method in java that calls itself is called recusive method
    // It makes the code compact but complex to understand
    //   Syntax:returntype methodname(){
    //    code to be executed
    //   methodname();
//   }

    //print your name finite times
      public static void anjan(){
        System.out.println("Anjan");
        anjan();
    }
// for finite times

    public static void main(String[] args) {
        anjan();
    }
}
