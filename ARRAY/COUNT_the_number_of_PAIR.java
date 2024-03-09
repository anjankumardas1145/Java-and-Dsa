package ARRAY;

public class COUNT_the_number_of_PAIR {
    public static void PAIR(int arr[]){
        for (int i=0;i< arr.length;i++){
            int cur=arr[i];{
                for (int j=i+1;j< arr.length;j++){
                    System.out.print("("+cur+","+arr[j]+")");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,3, 4};
        PAIR(arr);
    }
}
