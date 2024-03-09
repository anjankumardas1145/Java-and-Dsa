package IMPORTANT_QUESTION;

import java.util.Scanner;
public class AMstrong_number_betwwen {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            int count = 0;
            int temp = i;
            while (temp > 0) {
                int rem = temp % 10;
                count++;
                temp = temp / 10;
            }
            temp = i;
            int ans = 0;
            while (temp > 0) {
                int reem = temp % 10;
                ans = ans + (int) Math.pow(reem, count);
                temp = temp / 10;
            }
            if (ans == i) {
                System.out.println(i+ " Is a armstrong number");
            }
        }
    }
}
