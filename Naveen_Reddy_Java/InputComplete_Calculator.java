package Naveen_Reddy_Java;

public class InputComplete_Calculator {
    public static void main(String[] args) {
        VeryAdv_Calc A=new VeryAdv_Calc();
        int R1=A.add();
        int R2=A.sub();
        int R3=A.mul();
        int R4=A.div();
        int R5=A.mod();
        double R6= A.power();
        System.out.println(" Th power of the number is: " +R6);
        System.out.println("The result is: " + "The sum is: "+R1 +" ,The sub is: "+R2 +" ,The mul is: "+R3 +" ,The div is: " +R4+ " ,The modulous is : "+R5);
    }
}
