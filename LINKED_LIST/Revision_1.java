package LINKED_LIST;

public class Revision_1 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(8);
        Node b=new Node(7);
        Node c=new Node(6);
        Node d=new Node(5);
        Node e=new Node(4);
        Node f=new Node(3);
//        System.out.println(a.next);
//        System.out.println(a);
//        System.out.println(a.data);
//        a.next=b;
//        System.out.println(a.next);
//        System.out.println(b);
//        b.next=c;
//        System.out.println(b.next);
//        System.out.println(c);
//        c.next=d;
//        System.out.println(c.next);
//        System.out.println(d);
//        d.next=e;
//        System.out.println(d.next);
//        System.out.println(e);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);

            System.out.println(a.next.next.next.next.next.data);



        Node temp=a;
        for (int i=0;i<=5;i++){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }

    }
}
