package JAVA_FUNDAMENTAL.OOPS;
class human{
   private String name;
   private  int age;
    public int  getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return  name;
    }
    public void setName(String n){
        name=n;
    }

}
public class encapsulation {
    public static void main(String[] args) {
        human h1=new human();
        h1.setAge(5);
        h1.setName("anjan");//this anjan is assign to string n in setName(),then assign to variable  .. name.. then return in the grtNAME method
        System.out.println(h1.getName()+":"+ h1.getAge());

    }
}
