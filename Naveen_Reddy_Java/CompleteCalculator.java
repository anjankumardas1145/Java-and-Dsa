package Naveen_Reddy_Java;

public class CompleteCalculator {
    public static void main(String[] args) {
        AdvCalc A=new AdvCalc();
        int R2=A.add(10,5);
        int R3=A.sub(10,5);
        int R4=A.mul(10,5);
        int R1= A.div(10,5);
        int R5=A.modulous(10,5);
        System.out.println("The sum is: "+R2);
        System.out.println("The sub is: "+R3);
        System.out.println("The mul is: "+R4);
        System.out.println("The div is: "+R1);
        System.out.println("The modulous is: "+R5);
    }
}
