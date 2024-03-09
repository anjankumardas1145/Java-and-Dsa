public class OOPS_CONCEPT_P1 {
    public static class student{
        String name;
        int roll;
        int percentile;
    }

    public static void main(String[] args) {
        student x=new student();
        x.name="ANJAN";
        x.roll=16;
        x.percentile=68;
        System.out.println("my name is:"+x.name);
        System.out.println("my roll number is:"+x.roll);
        System.out.println("my percentile is:"+x.percentile);
        student y=new student();
        y.name="RANJAN";
        y.roll=3;
        y.percentile=87;
        System.out.println("his name is:"+y.name);
        System.out.println("his rroll number is:"+y.roll);
        System.out.println("this is his percentile:"+y.percentile);
    }
}
