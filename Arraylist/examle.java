package Arraylist;
import java.util.ArrayList;
public class examle {
    public static void main(String[] args) {
        //ArrayList<Integer> L1 = new ArrayList<>();
        //ADD  element into the array
        ArrayList L1=new ArrayList<>();
        L1.add(5);
        L1.add(6);
        L1.add(7);
        L1.add(8);
        L1.add(9);
        //get an element at index [i]
        System.out.print(L1.get(3));
        //using loop
        //for (int i = 0; i < L1.size(); i++) {
           // System.out.print(L1.get(i) + " ");
        //}
        //print the number directly
        System.out.print(L1);
        L1.add(1,100);
        System.out.println(L1);
    }
}
