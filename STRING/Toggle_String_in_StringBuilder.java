package STRING;

import java.util.Scanner;

public class Toggle_String_in_StringBuilder {
    public static void main(String[] args) {
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());

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
                str.setCharAt(i,bh);
            }
            else{
                asci -= 32;
                char bh=(char)asci;
                str.setCharAt(i,bh);

            }
        }
        System.out.println(str);
    }
}

