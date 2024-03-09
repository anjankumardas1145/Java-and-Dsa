import java.util.Scanner;

public class Print_First_10_natural_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.print(" "+i+" ");
        }
    }
}
