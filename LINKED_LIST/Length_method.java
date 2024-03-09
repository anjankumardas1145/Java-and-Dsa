package LINKED_LIST;

public class Length_method {
    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;

        }
    }
public static int lengthOfLl(Node head){
       Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;

}
    public static void main(String[] args) {
        Node a=new Node(6);
        Node b=new Node(7);
        Node c=new Node(8);
        Node d=new Node(9);
        Node e=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        int  p=lengthOfLl(a);
        System.out.println("the number of element int the list is:"+p);

    }
}
