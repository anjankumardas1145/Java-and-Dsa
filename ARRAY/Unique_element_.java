package ARRAY;

public class Unique_element_ {
    public static void main(String[] args) {
        //step to solve the problem
        //1 st:traverse the array
        //2 nd:mark -1
        //3 rd:again traverse the array
        int arr[]={1,2,9,4,2,1,3};

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;//bcz those element are same they are initialise as -1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                ans=arr[i];
                System.out.println("the unique number is:"+ans);
            }
        }

    }
}
