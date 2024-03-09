package OOPS;

public class Array_of_object {
    public static class pupils{
        int roll;
        int marks;
        String name;
        public pupils(int roll,int marks,String name){
            this.roll=roll;
            this.marks=marks;
            this.name=name;
        }
    }

    public static void main(String[] args) {
        pupils[] pup=new pupils[3];
        pupils p1=new pupils(101,410,"Anjan");
        pupils p2=new pupils(102,524,"Ranjan");
        pupils p3=new pupils(103,360,"Swadin");
        pup[0]=p1;
        pup[1]=p2;
        pup[2]=p3;
        //creating an array of object
        for (int i=0;i< pup.length;i++){
            System.out.println(pup[i].name+" "+pup[i].roll+" "+pup[i].marks);
        }
    }
}
