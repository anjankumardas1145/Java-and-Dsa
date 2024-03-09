package ALL_PATTERN;

public class RHOMBUS {
    public static void solid_rhombus(int n){
        for (int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=6;
        solid_rhombus(n);
    }
}
