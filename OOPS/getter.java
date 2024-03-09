package OOPS;

public class getter {
    public static void carrr(Car c1){
        c1.name="Audi";
        System.out.println(c1.name);
    }
    public static void main(String[] args) {
        Car c1=new Car();
        //c1.colour="white";
        c1.name = "mercedes";
       // c1.price=4000000;
        // as i declare price as a prvate in car class
       // so i can not access it  out side the class
        //but here i have to use GETTER FUN to access my value althrough it is private
        System.out.println(c1.getPrice());//getPrice() is function
        System.out.println(c1.getcolour());
//c1.setColour("BLUE");
//print kariba pai
        c1.setColour("red");
        System.out.println(c1.getcolour());
        System.out.println(c1.getPrice());
    }
}
