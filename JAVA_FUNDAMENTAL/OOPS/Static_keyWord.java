package JAVA_FUNDAMENTAL.OOPS;
class Mobile{
    String brand;
    int price;
    String network;
   static String name;
    public void show(){
        System.out.println(brand+ " : "+ price+" : "+network+" : "+name);
    }
}
public class Static_keyWord {
    public static void main(String[] args) {
Mobile obj1=new Mobile();
obj1.brand="Apple";
obj1.price=1300;
obj1.network="jio";
//obj1.name="SmartPhone";//Mobile.name="phone"
        Mobile obj2=new Mobile();
        obj2.brand="Motorla";
        obj2.price=13000;
        obj2.network="jioo";
       // obj2.name="SMRTphonE";//Mobile.name="phone"
        Mobile.name="anjan";//Static variable call eith class name

        obj1.show();
        obj2.show();
        //Static variable always called
            //with class.static_variable
    }
}
