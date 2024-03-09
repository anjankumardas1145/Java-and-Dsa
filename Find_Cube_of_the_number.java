import java.util.Scanner;

public class Find_Cube_of_the_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n= sc.nextInt();
        int ans=0;
        for (int i=1;i<=n;i++){
            ans=i*i*i;
            System.out.println("the cube of the number is:"+ans);
        }
    }
}
