package LeetCode;
//given an integer array num,return true if any value appears at least twice in the array ,and return false if every element is distinct.-
//Here time complexity is O(n*n)

public class duplicateNumber {
    public static void main(String[] args) {
        int [] num={1,2,3,4,4};
      boolean result=  duplicateNumber(num);
        System.out.println("The result is: "+result);
    }
    public static boolean duplicateNumber(int[] num){
        for(int i=0;i< num.length;i++){
            for (int j=i+1;j< num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
