import java.util.Scanner;

public class Area_of_a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
/*
        int side= sc.nextInt();

        int area=side*side;
        System.out.println(area);*/
        //area of aRECTANGLE
        System.out.println("enter the length of the rectangle:");
        int side1= sc.nextInt();
        System.out.println("enter the breath of the rectangle:");
        int side2= sc.nextInt();
        int area=2*(side1+side2);
        System.out.println("the area is:"+area);
    }
}
