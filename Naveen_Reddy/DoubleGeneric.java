package Naveen_Reddy;

public class DoubleGeneric {
    public static void main(String[] args) {
        myData("Jay Shree Ram");
        DoubleGeneric d1=new DoubleGeneric();
        d1.yrData(12);
        d1.yrData("Ankita");
    }
    static <E> void myData(E data){
        System.out.println(data);
    }

    <A> void yrData(A data){
        System.out.println(data);
    }
}
