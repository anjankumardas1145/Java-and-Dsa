package IMPORTANT_;

public class AAAbbb_aaaBBB {
    public static String convert(String input){
        int length=input.length();
        String firstHalf=input.substring(0,length/2).toLowerCase();
        String secondHalf=input.substring(length/2).toUpperCase();
        //combine both first and second
        return firstHalf+secondHalf;
    }
    public static void main(String[] args) {
String input="AAAbbb";
String Result=convert(input);
        System.out.println("The final output is: "+ Result);
    }
}
