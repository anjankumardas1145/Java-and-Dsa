import java.util.Scanner;

public class MULTIPLICATIN_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int b=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(b+"X"+i+"="+b*i);
        }
    }
}
