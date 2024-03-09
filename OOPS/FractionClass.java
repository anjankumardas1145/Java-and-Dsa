package OOPS;

public class FractionClass {
   public  static  class fraction{
        int num;
        int den;
        public  fraction(){

        }
        public fraction(int num,int den){
            this.num=num;
            this.den=den;
        }

        public void simplyfy() {
        }


    }

    public static void main(String[] args) {
        fraction f1=new fraction(4,7);
        System.out.println(f1.num+"/"+f1.den);
        fraction f2=new fraction(5,6);
        System.out.println(f2.num+"/"+ f2.den);
        System.out.println(f1.num+"/"+f2.den);


    }
}
