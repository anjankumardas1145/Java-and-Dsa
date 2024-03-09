package OOPS;

public class studentClass {
    public static class student{
        String name;
        int roll;
        double percentile;

    }
    public static class cricket{
        String name;
        int jersy_no;
        int highest_score;
    }

    public static void main(String[] args) {
        student s1=new student();
        s1.name="ANJAN";
        s1.roll=45;
        s1.percentile=65.89;
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.percentile);
        cricket c1=new cricket();
        c1.name="ROHIT";
        c1.highest_score=264;
        c1.jersy_no=45;
        System.out.println(c1.name+" has  highest score "+c1.highest_score+" in odi with jersy number "+c1.jersy_no);
        c1.name="VIRAT";
        c1.jersy_no=18;
        c1.highest_score=183;
        System.out.println(c1.name+" has highest score "+c1.highest_score+" in odi with jersy number "+c1.jersy_no);

    }
}
