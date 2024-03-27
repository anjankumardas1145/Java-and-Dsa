package LeetCode;

public class Q1 {
   //  Given an array of integer nums and an integer target ,return indices of the two number such that they add up to target
   public static void main(String[] args) {
       int[] num={5,10,20,29,6};
       int target=30;
       for(int i=0;i<= num.length;i++){
           for (int j=i+1;j< num.length;j++){
               if (num[i]+num[j]==target){
                   System.out.println("["+i +" "+ j+"]");
               }
           }
       }
   }
}
