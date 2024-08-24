package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_interface {
    public static void main(String[] args) {
        Set<Integer> num=new TreeSet<>();
        num.add(6);
        num.add(3);
        num.add(40);
        num.add(7);
        num.add(8);
        num.add(1);
        num.add(60);
        // element should be unique
        // there is sequence in HashSet so here we use TreeSet class

        System.out.println(num);
        for(int n: num){
            System.out.println(n);
        }

    }
}
