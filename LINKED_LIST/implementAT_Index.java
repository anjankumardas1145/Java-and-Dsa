package LINKED_LIST;

public class implementAT_Index {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;

        }
        public Node(){

        }

    }
    public static class linklist{
       Node head=null;
        Node tail=null;
        void insertAT(int  value){// ek functoon
            Node temp=new Node(value);
            if (head==null){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
            }

        }
        void display(){// ek aur function
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }

        }

    }

    public static void main(String[] args) {
     linklist ll=new linklist();
     ll.insertAT(4);
     ll.insertAT(5);
        ll.display();
    }
}
