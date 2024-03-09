package ALL_PATTERN;
import java.util.Scanner;
public class HOLLOW_rectangle {
    public static void hollowREctangle(int totalrw,int totalclm){
       //outer loop
        for (int i=1;i<=totalrw;i++){
            //inner loop
            for (int j=1;j<=totalclm;j++){
               if (i==1||i==totalrw|j==1||j==totalclm){
                   //boundry cell
                   System.out.print("*");
               }else{
                   System.out.print(" " )   ;

               }}
                System.out.println(" ");
            }
        }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int r=sc.nextInt();
        System.out.println("enter the number of columns:");
        int c=sc.nextInt();

        hollowREctangle(r,c);
    }



                }


