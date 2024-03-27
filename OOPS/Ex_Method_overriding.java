package OOPS;
class aanimal{
    void eat(){
        System.out.println("thēy eat everything");
    }
}
class deer extends aanimal{
    void eat(){
        System.out.println("they eat only grass");
    }
}
public class Ex_Method_overriding {
    public static void main(String[] args) {
aanimal a1=new aanimal();
a1.eat();
aanimal a2=new deer();
a2.eat();
    }
}
