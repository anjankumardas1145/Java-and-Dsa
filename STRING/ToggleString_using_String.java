package STRING;

import java.util.Scanner;

public class ToggleString_using_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str= sc.nextLine();

            for (int i=0;i<str.length();i++){
                //check first small letter or capital letter
                boolean flag=true;

                char ch= str.charAt(i);


                if (ch == ' ')  continue;//this line is used when there is more the one words


                int asci=(int)ch;

                if(asci>97) flag=false;
                if(flag==true){
                    asci += 32;
                    char bh=(char)asci;
                    str= str.substring(0,i)+ bh + str.substring(i+1);
                }
                else{
                    asci -= 32;
                    char bh=(char)asci;
                    str= str.substring(0,i)+ bh + str.substring(i+1);


                }
            }
            System.out.println(str);
        }
    }





