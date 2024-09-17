package LINKED_LIST;

public class addFirst_in_linklist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head; // Head of the linked list
    public static Node tail;

    // Method to add a node at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data); // Step 1: Create a new node
        if (head == null) {            // If list is empty, initialize head and tail

            head = tail = newNode;
            return;
        }
        newNode.next = head;           // Step 2: Point new node's next to the current head
        head = newNode;                // Step 3: Move the head to the new node
    }
public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
}

//  insert int he middle
    public void add(int idx,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while (i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1;temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    // Method to print the list
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-");
            temp = temp.next; // Move to the next node
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addFirst_in_linklist ll = new addFirst_in_linklist();
       // ll.printList();
        ll.addFirst(2); // Add nodes to the list
        //ll.printList();
        ll.addFirst(1);
       // ll.printList();
        ll.addLast(3);
        //ll.printList();
        ll.addLast(4);
        ll.add(2,9);

        ll.printList(); // Print the list after adding nodes
    }
}
