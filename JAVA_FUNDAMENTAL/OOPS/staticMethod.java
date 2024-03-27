package JAVA_FUNDAMENTAL.OOPS;
class mobilee{
    String name;
    int price;
    static String network;

   /* public static void show(){
        System.out.println(price+" : "+name+" : "+network);
    } this is in correct to make a function */

    public static void show(mobilee obj){
        System.out.println(obj.price+" : "+obj.name+" : "+network);
    }

}
public class staticMethod {
    public static void main(String[] args) {
        mobilee m1=new mobilee();
        m1.name="motorla";
        m1.price=6578;
        mobilee m2=new mobilee();
        m2.price=4567;
        m2.name="realme";
        mobilee.network=" jio";//static type
       // m2.show();//wew can not call the static method with object
        mobilee.show(m1);//call with class and and argument is the object m1 here
    }
}
