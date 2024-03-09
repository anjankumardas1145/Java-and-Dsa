package IMPORTANT_;

public class Binary_to_Decemal {
    public static void BInary(int n){
        int decimal=0;int pow=0;
        while (n>0){//101
            int rem=n%10;//1
            decimal=decimal+(rem*(int)Math.pow(2,pow));//0+(1*1)=1
            pow++;
            n/=10;
        }
        System.out.println("the decimal number is: "+decimal);
    }

    public static void main(String[] args) {
        BInary(101101);
    }
}
