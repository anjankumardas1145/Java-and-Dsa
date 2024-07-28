package Naveen_Reddy_Java;
class Human{
    private int age;
    private String name;
    public Human(){
        age=12;
        name="Anjan";
      //  System.out.println(age +" : "+ name);
    }
    public Human(int age,String name){
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Human H2=new Human();
        Human H3=new Human(21,"Ankita");
        System.out.println(H2.getAge() +","+ H2.getName());
        System.out.println(H3.getAge() +","+ H3.getName());

    }

}
