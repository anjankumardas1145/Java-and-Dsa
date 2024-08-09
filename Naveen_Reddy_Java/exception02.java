package Naveen_Reddy_Java;

public class exception02 {
    public static  void main(String[] args) {
        String s1=null;
        try{
            System.out.println(s1.length());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(5/0);
        }catch(ArithmeticException a){
            System.out.println(a.getMessage());
        }
        System.out.println("Anjan Kumar Das");
    }
}
