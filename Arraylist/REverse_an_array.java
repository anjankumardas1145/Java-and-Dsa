package Arraylist;
import java.util.ArrayList;
public class REverse_an_array {
    public static void reverlist(ArrayList<Integer>list){
       int i=0,j= list.size()-1;
       while(i<j){
           Integer temp=Integer.valueOf(list.get(i));
           list.set(i,list.get(j));
           list.set(j,temp);
i++;j--;
       }
        System.out.print("the reversed array is:"+list);
    }

    public static void main(String[] args) {
       // ArrayList<Integer>list=new ArrayList<>();//it also can write down instead of the below line
        ArrayList list=new ArrayList();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("the original array is:"+list);
        reverlist(list);
        //System.out.println("the reversed array is: "+list);
    }
}
