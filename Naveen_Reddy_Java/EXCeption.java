package Naveen_Reddy_Java;

public class EXCeption {
    public static void main(String[] args) {
        String str=null;
        try {


            System.out.println(str.length());

        }
        catch(NullPointerException n1){
            System.out.println(n1.getMessage());
        }
        System.out.println("Anjan Kumar Das");
        try {
            System.out.println(5 / 0);
        }
        catch(Exception e1){
            System.out.println(e1.getMessage());
        }
        System.out.println(" Ranjan Kumar Das");
        System.out.println(5/0);
        System.out.println("Anjan kumar Das");
    }
}
