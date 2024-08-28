package USBM;
import java.util.*;
public class METRO_TICKET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
                int age= sc.nextInt();
               sc.nextLine();
        System.out.println("enter the gender");
        String gender=sc.nextLine();
//        int final=sc.nextInt();

            if (age <= 5) {
                System.out.println("100%");
            } else if (age <= 8) {
                System.out.println("50%");
            } else if (gender.equals("female") && age > 65) {
                System.out.println("70%");
            } else if (gender.equals("female")) {
                System.out.println("50%");
            } else if (age > 65) {
                System.out.println("70%");
            } else {
                System.out.println("0%");
            }

    }
}
