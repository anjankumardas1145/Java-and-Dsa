package ARRAY;

public class LINEAR_SEarch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key=3;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                System.out.println("the target element is at"+i);
            }
        }
    }
}
