package LINKED_LIST;

public class Length_of_LinkedList {
public static int length(Node head){
    int count=0;
    while(head!=null){
        count++;
        head=head.next;
    }
    return count;
}
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
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println(" The length of my linked List is : " +length(b));
        //length(a);
    }
}
