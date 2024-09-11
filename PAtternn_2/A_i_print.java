package PAtternn_2;

public class A_i_print {
    public static void main(String[] args) {
        char ch='A';
        int n=3;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(ch+ " ");
                ch= (char) (ch+1);

            }
            System.out.println();
        }
    }
}
