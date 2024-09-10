package ARRAY;

public class Dp {
    public static int arrray(int arr[]){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[]={1,2,2,3,5,7};
        int result=arrray(num);
        if (result!= -1){
            System.out.println("the duplicate element is: " +result);
        }else{
            System.out.println(" the first duplicate number is not found");
        }
    }
}
