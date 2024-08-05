package Naveen_Reddy_Java;
class Process1 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Process1 :"+i);
        }
    }

}
class Process2 implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
        System.out.println("Process2 :"+i);
    }

}}

public class MultiThread {
    public static void main(String[] args) {
Process1 P1=new Process1();
Process2 P2=new Process2();
Thread t1=new Thread(P1);
        Thread t2=new Thread(P2);
        t1.start();
        t2.start();
    }
}
