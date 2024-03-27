import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the array");
        System.out.println("input the size of the array:");
        int n = sc.nextInt();
        int[] myArr = new int[n];
        System.out.println("enter power ");
        int pov= sc.nextInt();
        double ans=power(myArr,pov);

        int i = 0;
        while (i < myArr.length) {
            System.out.println("enter the element " + (i + 1) + " as input");
            myArr[i] = sc.nextInt();
            i++;
        }
        //for displaying
        int j = 0;
        while (j < myArr.length) {
            System.out.print(myArr[j] + " ");
            j++;
        }
    }

        public static double power(int[] myArr,int pow){
        int i=0;
        double result=1;
        while(i< myArr.length){
             result=Math.pow(myArr[i],pow );
           // System.out.println();
            i++;
        }
            System.out.println(result);
        return result;
        }
    }

