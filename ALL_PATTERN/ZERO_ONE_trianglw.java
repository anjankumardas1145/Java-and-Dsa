package ALL_PATTERN;

public class ZERO_ONE_trianglw {
    public static void rohit(int n) {
        //for outer loop
        for (int i = 1; i <= n; i++) {
            //for innere loop
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();

        }}
        public static void main (String[]args){
            int a = 5;
            rohit(a);
        }
    }
