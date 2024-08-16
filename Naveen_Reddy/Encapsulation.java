package Naveen_Reddy;
class Humann{
    private int age;
    private String name;
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Humann H1=new Humann();
        H1.setAge(21);
        H1.setName("Anjan Das");
        System.out.println(H1.getAge());
        System.out.println(H1.getName());
    }
}
