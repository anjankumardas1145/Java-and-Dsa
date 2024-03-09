public class defult_VALUE_in_OOPS {
    public static class student{
        String name;
       private  int roll;
        float percentile;
    }

    public static void main(String[] args) {
        student s1=new student();
        s1.roll=43;
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.percentile);
    }

}
