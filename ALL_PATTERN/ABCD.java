package ALL_PATTERN;

public class ABCD {
    public static void main(String[] args) {
        int n=4;
        char count=65;
        for (char i=65;i<=69;i++){
            for (char j=65;j<=i;j++){
                System.out.print(count);
               count++;

                // System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
