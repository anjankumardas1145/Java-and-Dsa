package IMPORTANT_;

import java.util.Scanner;

public class Print_yr_name_5_times_using_array {
    public static void main(String[] args) {
String str[]=new String[5];

        //take input fromt the user
        for (int i=0;i<=4;i++){
            str[i]="Anjan Kuamr Das";
        }

        //show the name
        for(int i=0;i<=4;i++){

            System.out.println((i+1)+". "+str[i]);

        }

    }
}
