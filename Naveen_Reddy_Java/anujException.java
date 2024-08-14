package Naveen_Reddy_Java;

public class anujException {
    public static void main(String[] args) {
        int arr[]=new int[9];
        try{
            System.out.println(arr[2]);
            int result=5/0;
            System.out.println(arr[10]);
            System.out.println(arr[2]);
            System.out.println(arr[0]);
        }
        catch(ArithmeticException |ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Ankita");
    }
}
