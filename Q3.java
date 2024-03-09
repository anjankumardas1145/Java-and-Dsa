import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil= sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pencil+pen+eraser;
        System.out.println("the total summ of these item is:"+total);
        float newtotal=total+(total*18/100);
        System.out.println(newtotal);
    }
}
