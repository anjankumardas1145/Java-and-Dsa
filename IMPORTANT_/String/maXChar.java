package IMPORTANT_.String;

public class maXChar {
    public static boolean maxChar(String str){
        char[] arr1=str.toCharArray();
        //System.out.println(arr1);
        for (int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
        return true;
   }
    public static void main(String[] args) {
        String s1="Ankita Das";

        maxChar(s1);
    }
}
