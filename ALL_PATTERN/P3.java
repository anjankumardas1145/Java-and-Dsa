package ALL_PATTERN;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of line:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<n-i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
//another logic
/*for(int i=1;i<=n;i++){
    for(int j=n;j>=i:j--){
    sout("*");}
    sout("");

        }*/