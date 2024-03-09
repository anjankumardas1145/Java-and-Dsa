public class Use_of_function_in_OOPS {
    public static class student{
        String name;
        int roll;
    }
    public static void fun(student s1){
        s1.name="ROHIT";

    }

    public static void main(String[] args) {
        student s=new student();
        s.name="ANJAN";
        s.roll=34;
        System.out.println(s.name);
        //updations
        s.name="RANJAN";
        System.out.println(s.name);
        fun(s);//function call CLASSES ARE passed by reference
        System.out.println(s.name);
    }
}
