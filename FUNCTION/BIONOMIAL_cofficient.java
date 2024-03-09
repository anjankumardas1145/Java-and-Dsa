package FUNCTION;

public class BIONOMIAL_cofficient {
    public static int factorial(int k){
        int fact=1;
        for (int i=1;i<=k;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int BIO(int n,int r){
        int fact_a=factorial(n);
        System.out.println(fact_a);
        int fact_b=factorial(r);
        System.out.println(fact_b);
        int fact_c=factorial(n-r);
        System.out.println(fact_c);
        int bio=fact_a/((fact_b)*(fact_c));
        return bio;
    }

    public static void main(String[] args) {
        int a=5;int b=2;

        System.out.println(BIO(a,b));
    }
}
