package JAVA_FUNDAMENTAL.Array;

import java.util.Scanner;

public class delete_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" this  program is for delete an element..");
        int[] myArray=ArrayUTILITY.inputArray();
        System.out.println("Enter the number you want to delete:");
        int deletNum= sc.nextInt();
        int[] newArr=deletElement(myArray,deletNum);
        System.out.println("the new array will be:");
        ArrayUTILITY.displayArr(newArr);

    }
    public static int [] deletElement(int[] myArray,int deletNum){
int occ=Challenge_2.noOfOccurance(myArray,deletNum);
if(occ==0){
    return myArray;
}
int newSize=myArray.length-occ;//size of the new Array
int[] newArray=new int[newSize];//declare the new array

int i = 0,j = 0;// i for old array and j for new array
        while(i< myArray.length){
            if(myArray[i] !=deletNum){
                newArray[j]=myArray[i];
                j++;
            }
            i++;
        }

        return newArray;
    }
}
