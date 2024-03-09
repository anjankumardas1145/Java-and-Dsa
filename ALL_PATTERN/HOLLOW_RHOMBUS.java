package ALL_PATTERN;

public class HOLLOW_RHOMBUS {
    public static void hello(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //hollow RHOMBUS
            for (int j=1;j<=n;j++){
                if (i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n=6;
        hello(n);

    }
}
