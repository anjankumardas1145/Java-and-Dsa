package Collection;

import java.util.ArrayList;
import java.util.List;

public class CL1 {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        //System.out.println(l1.isEmpty());
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Integer>l2=new ArrayList<>();
        l2.add(5);
        l2.add(3);
        l2.add(4);

        l1.removeAll(l2);//the element remove here which is present in both l1 and l2
        System.out.println(l1);
        l1.retainAll(l2);//it removes all the element which are not present in the list l2
        System.out.println(l1);
    }
}
