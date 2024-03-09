package Arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class Rev_Using_COLLECTION {
    public static void main(String[] args) {
       // ArrayList list=new ArrayList();
ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("original arrar list is: "+list);
        Collections.reverse(list);
        System.out.println("reversed list is:"+list);
    }
}
