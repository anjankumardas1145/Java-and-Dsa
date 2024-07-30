package Naveen_Reddy_Java;

public class InputComplete_Calculator {
    public static void main(String[] args) {
        InputAdvCalc A=new InputAdvCalc();
        int R1=A.add();
        int R2=A.sub();
        int R3=A.mul();
        int R4=A.div();
        int R5=A.mod();
        System.out.println("The result is: " + "The sum is: "+R1 +" ,The sub is: "+R2 +" ,The mul is: "+R3 +" ,The div is: " +R4+ " ,The modulous is : "+R5);
    }
}
