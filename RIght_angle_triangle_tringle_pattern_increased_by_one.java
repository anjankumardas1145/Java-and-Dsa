import java.util.Scanner;

public class RIght_angle_triangle_tringle_pattern_increased_by_one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=1;
        System.out.println("enter the number");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
