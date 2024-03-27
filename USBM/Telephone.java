package USBM;
import java.util.Scanner;
public class Telephone {
    int pre, prev;

    int call;
    String name;
    double amt=180;
    double total;
    double amount_except_180;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of the consumer:");
        name = sc.nextLine();
        System.out.println("Enter previous meter reading:");
        prev = sc.nextInt();
        System.out.println("Enter present meter reading:");
        pre = sc.nextInt();
        call=pre-prev;
    }

       public void cal() {//FROM Ankita
           // call = pre - prev;
            if (call <= 100) {
               total = amt;
           } else if (call >100 && call <= 200){total = amt + (0.9 * (call - 100));
       }
        else if(call>200&&call<=400){
        total=amt+(0.9*100)+(0.8*(call-200));
         }
       else {
                total = amt + (0.9 * 100) + (0.8 * 100) + (0.7 * (call - 400));

           }
           amount_except_180=total-amt;
           }
        void display() {
            System.out.println("Name of the consumer: " + name);
            System.out.println("Calls made: " + call);
            System.out.println("Amount: " + amt);
            System.out.println("Total amount to be paid: " + total);
            System.out.println("total amount without compulsury 180 is "+total+" - "+amt+" = "+amount_except_180 );
        }

        public static void main(String[] args) {
            Telephone myPhone = new Telephone();
            myPhone.input();
            myPhone.cal();
            myPhone.display();
        }
    }

