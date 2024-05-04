package Recursion;

public class print_finite_time {
   static int count=0;
    static void p(){
        count++;
        if(count<=5){
            System.out.println("ANJAN "+count);
            p();
        }
    }

    public static void main(String[] args) {
        p();
    }
}
