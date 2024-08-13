package Collection;

import java.util.ArrayList;
import java.util.List;

public class Array_list {
    public static void main(String[] args) {
        List<Integer> L1=new ArrayList<>();
        L1.add(7);//add() is the method of collection interface
        L1.add(7);
        L1.add(5);
        L1.add(8);
        try {
            L1.remove(4);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        L1.remove(2);//it removes the second index
        System.out.println(L1);//prints the all elements
        System.out.println(L1.size());//prints size of the ArrayList
        System.out.println(L1.contains(4));//L1 has this item or not,it returns boolean value
        System.out.println(L1.contains(7));//L1 has this item or not
        for(int i=0;i< L1.size();i++) {//here we want to show all the element
            System.out.println(L1.get(i));//get() used to print one by one

        }
//            //srting type
//            List<String> Str=new ArrayList<>();
//            Str.add("Anjan");
//            Str.add("Ranjan");
//            Str.add("Bijay");
//            Str.add("Sanjan");
//        System.out.println(Str);
//            for (int i=0;i<Str.size();i++){
//                System.out.println(Str.get(i));
//            }
        }
    }

