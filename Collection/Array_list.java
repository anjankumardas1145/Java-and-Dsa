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
        System.out.println(L1);
        for(int i=0;i< L1.size();i++) {
            System.out.println(L1.get(i));

        }
            //srting type
            List<String> Str=new ArrayList<>();
            Str.add("Anjan");
            Str.add("Ranjan");
            Str.add("Bijay");
            Str.add("Sanjan");
        System.out.println(Str);
            for (int i=0;i<Str.size();i++){
                System.out.println(Str.get(i));
            }
        }
    }

