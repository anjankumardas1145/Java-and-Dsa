package OOPS_By_KG;
class calculatoor{
    int num=5 ;
    String anjan;
    public int  add(int n1,int n2){
        int ans=n1+n2;
        if(ans%2==0){
            System.out.println("even");
        }
        System.out.println();
        return ans;
    }
//    What is the method overloading in Java?
//    Method overloading in Java means having two or more methods (or functions)
//    in a class with the same name and different arguments (or parameters).
//    It can be with a different number of arguments or different data types of arguments.
//Here BELOW METHOD OVERLOADING IS HAppENING
    public int  add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int  add(int n1,int n2,int n3,int n4){
        return n3+n4;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
}
public class method_over_loading{
    public static void main(String[] args) {
        calculatoor c1=new calculatoor();
        int result= c1.add(2,4);
       int result1=c1.add(8,9,7);
       int result2=c1.add(9,0,8,7);
       System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
    }

