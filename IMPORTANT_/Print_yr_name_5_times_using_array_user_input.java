package IMPORTANT_;
import java.util.*;
public class Print_yr_name_5_times_using_array_user_input {
    public static void main(String[] args) {
        //import scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        //take input from the user
        String name= sc.nextLine();
        //Delare an array of string type
        String str[]=new String[5];
        //store the name inside the array
        for(int i=0;i< str.length;i++){
            str[i]=name;
        }
        //show in the output window
        for(int i=0;i< str.length;i++){
            System.out.println((i+1)+ " ."+str[i]);
        }
    }
}
