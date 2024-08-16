package Naveen_Reddy;

public class Gen_2 {


    public static void main(String[] args) {
        Dog<String,Integer> D1=new Dog<>("Anjan",22);
        Dog<Integer,Integer> D2=new Dog<>(23,89);//i know inside name why i store integer just to test
        Dog<Integer,String> D3=new Dog<>(23,"Anjan");
    }
}
class Dog<T,V>{
    T id;

    V name;
    //constructor
    public Dog(T id ,V name){

        this.id=id;
        this.name=name;
        System.out.println(id +" "+name);
    }

}