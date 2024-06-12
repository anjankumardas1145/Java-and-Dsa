package INSTAGRAM;
class one{
    static{
        System.out.println("Class 1");
    }
}
class two extends one{
    static{
        System.out.println("class 2");

    }
}
class three extends two{
    static{
        System.out.println("class 3");
    }
}
public class Quiz_04 {
    public static void main(String[] args) {
        three t=new three();
    }
}
