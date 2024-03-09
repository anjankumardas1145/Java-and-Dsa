package LINKED_LIST;

public class linkedlist {

        public static class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
            }
        }

        public static Node head;
        public static Node tail;

        public static void addFirst(int data) {
            //step 1 create new node
            Node newnode = new Node(data);
            if (head == null) {
                head = tail = newnode;
            } else {
                newnode.next = head;
                head = newnode;
            }

        }


    public static void main(String[] args) {
        linkedlist LL=new linkedlist();
        LL.addFirst(2);
        LL.addFirst(4);

    }
}