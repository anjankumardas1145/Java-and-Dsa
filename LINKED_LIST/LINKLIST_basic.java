package LINKED_LIST;

public class LINKLIST_basic {
    public static class Node{
        int data;
        Node next;
        public  Node(){
        }
        public Node(int data)
        {
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        System.out.println(a.next);//null
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        Node e=new Node(9);
a.next=b;
b.next=c;
c.next=d;
d.next=e;

        // the below five statement is for fundamental concept
      /*  System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);*/
        Node temp=a;
        //when the numbe of element is given
       /* for (int i=1;i<=5;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }*/
        //but when we dont know about the number of element at that time we use while loop with a condition :we know that our last
                                  //element address ta always null so condition will be:while(temp!=null)
                               //if any doubt 56.44 minutes in the class of raghav sir
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
