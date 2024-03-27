package JAVA_FUNDAMENTAL.Array;

public class Check_sorted_or_not{
    public static void main(String[] args) {
        int[] myArr=ArrayUTILITY.inputArray();
        System.out.println("check the array is sorted or not:");
boolean inCrease=isIncreasing(myArr);
boolean Decrese=isDcreasing(myArr);
if(inCrease || Decrese){
    System.out.println(" my array is sorted..");
}else{
    System.out.println("my array is not sorted..");
}
        }

        public static boolean isIncreasing(int[] myArr){
        int i=1;
        while (i< myArr.length){
            if(myArr[i]<myArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
        }
        public static boolean isDcreasing(int[]myArr){
            int i=1;
            while (i< myArr.length){
                if(myArr[i]>myArr[i-1]){
                    return false;
                }
                i++;
            }
        return true;
        }
}
