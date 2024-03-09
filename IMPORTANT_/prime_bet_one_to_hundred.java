package IMPORTANT_;

public class prime_bet_one_to_hundred {
    public static void main(String[] args) {
        int num=0;//to count the number of prime number between 1 - 100
        for (int i=1;i<=100;i++){
           int count=1;

            for (int j=2;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                num++;
                System.out.print(i+" ");
            }

        }
        System.out.println("the total prime number between 1-100 is:"+num);
    }
}
