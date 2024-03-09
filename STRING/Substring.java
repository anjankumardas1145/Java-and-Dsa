package STRING;
import java.util.*;
public class Substring {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in) ;
        System.out.println("enter the string:");
     String name= sc.nextLine();
     for (int i=0;i<=name.length();i++){//here you can write i<name.length()
         for (int j=i+1;j<=name.length();j++){
             System.out.print(name.substring(i,j)+" ");
         }
     }

    }
}
