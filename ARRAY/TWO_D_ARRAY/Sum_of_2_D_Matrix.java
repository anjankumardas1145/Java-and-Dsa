package ARRAY.TWO_D_ARRAY;
import java.util.Scanner;
public class Sum_of_2_D_Matrix {
    public static void ADDD(int a[][],int r1,int c1,int b[][],int r2,int c2){
        int sum[][]=new int[c1][r1];
        if (r1!=r2||c2!=c1){
            System.out.println("wrong ans ");
        }
        System.out.println("the sum of the array is:");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row size and column size for first array:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("enter " + r1 * c1 + " element into a:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the row and column for second array");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("enter" + r2 * c2 + " element into b:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        ADDD(a,r1, c1,b, r2, c2);
    }

}
