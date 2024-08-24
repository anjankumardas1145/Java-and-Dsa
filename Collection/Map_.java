package Collection;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {
        Map<String,Integer> student=new HashMap<>();
        student.put("Ankita",99);
        student.put("Anjan",77);
        student.put("java",21);
        student.put("phython",22);

        //note:key should be unique and value can be duplicate

        System.out.println(student);
        System.out.println(student.get("Anjan"));//return the value of object "Anjan"
        System.out.println(student.size());//return the size oof the map
        System.out.println(student.keySet());//return all the keys
        System.out.println(student.values());//return all the values


        for(String key:student.keySet()){
            System.out.println(key + " : "+student.get(key));

        }

    }
}
