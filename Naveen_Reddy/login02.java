package Naveen_Reddy;
import javax.swing.*;
public class login02 extends JFrame{
public void setComponent(){//not a predefind function
    JLabel j1=new JLabel("Welcome");//
    JTextField t1=new JTextField();
    t1.setBounds(170,100,100,40);
    add(t1);
    setLayout(null);
    j1.setBounds(100,100,200,40);
    add(j1);//this means s1.add(j1)


}


    public static void main(String[] args) {
       login02 l1=new login02();
       l1.setTitle("My login page");
       l1.setVisible(true);
       l1.setSize(300,200);
       l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       l1.setComponent();
    }
}
