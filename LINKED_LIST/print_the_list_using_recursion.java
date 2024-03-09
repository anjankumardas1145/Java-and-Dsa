package LINKED_LIST;

public class print_the_list_using_recursion{


        public static class Node{
            int data;
            Node next;
            public Node(){

            }
            public Node(int data){
                this.data=data;
            }

        }
        public static void recursively(Node head){
            Node temp=head;
            if (temp==null){
                return;
            }
            System.out.print(temp.data+" ");
            recursively(temp.next);

          //  System.out.print(temp.data+" ");//if i write this then the elements are print reverse order
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
            recursively(a);
        }
    }


