package Naveen_Reddy_Java;

public class Exception03 {
    public static void main(String[] args) {
        String s=null;
        try{
            System.out.println(s.length());//ek try block main more then one statement likha ja sakta hai
            System.out.println(5/0);
        }
        catch(NullPointerException n){
            System.out.println(n.getMessage());
        }
        catch(ArithmeticException a){//if here i dont have any catch()  block then java catch the exception so that 
            System.out.println(a.getMessage());
        }
        System.out.println("Anjan kumar Das");
    }
}
