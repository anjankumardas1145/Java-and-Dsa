package LINKED_LIST;

public class using_fun_print_the_list {
    public static class Node{
        int data;
        Node next;
        public Node(){

        }
        public Node(int data){
            this.data=data;
        }

    }
    public static void Llist(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
       Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        Node e=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Llist(a);
    }
}
