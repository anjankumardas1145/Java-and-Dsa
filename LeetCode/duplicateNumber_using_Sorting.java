package LeetCode;
import java.util.Arrays;
public class duplicateNumber_using_Sorting {
    public static void main(String[] args) {
        int[] num={1,2,3,4,2};
        boolean result=checkDuplicate(num);
        System.out.println("The result is: "+ result);
//Here the time complexity is O(logn)
    }
    public static boolean checkDuplicate(int[] num){
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            if (num[i]==num[i+1]){
                return true;
            }
        }
        return false;
    }
}
