package SORTING;
    public class bubble {

        public static void main(String[] args) {
            //the input is given by the user here
            int arr[]={9,2,3,4,6,5};
            for (int i=0;i< arr.length-1;i++){
                for (int j=0;j< arr.length-i-1;j++){
                    //swaping
                    if (arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }
        }

}