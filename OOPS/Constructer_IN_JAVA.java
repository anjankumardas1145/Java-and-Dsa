package OOPS;



public class Constructer_IN_JAVA {
    public static void main(String[] args) {
        student s1=new student("ANJAN",56,68.00);
        System.out.println(s1.name);
        System.out.println(s1.percentile);
        System.out.println(s1.roll);
        student s2=new student("RANJAN",45,87.90);
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.percentile);

    }
}
