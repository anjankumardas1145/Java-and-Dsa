package ALL_PATTERN;

public class PYRAMID {
    public static void pro(int n){
        for (int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for (int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print("");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a=5;
        pro(a);
    }
}
