package JAVA_FUNDAMENTAL.OOPS;
class grandfather{
    String name;
    public void noCall(){
        System.out.println("they had no facility to call anyone");
    }
    public void poverty(){
        System.out.println("the hava face prverty:");
    }
}
class father extends grandfather{
    String name;
    String dist;
    public void education(){
        System.out.println("they dont'n get as much as resources like us");
    }
}
class mySelf extends father{
    int age;
    public void myEducation(){
        System.out.println("i have get better resource the them");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
mySelf Anjan=new mySelf();
Anjan.noCall();
Anjan.name="Ankita";
        System.out.println(Anjan.name);
    }
}
