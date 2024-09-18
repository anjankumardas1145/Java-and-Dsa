package LINKED_LIST;

public class self_practice {
    public  static class Node{
        int data;
        Node next;
        public Node(int data){
           this.data=data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;


        // add at any index in the linked list
           void insertAt(int idx,int value){
              Node t=new Node(value);
              Node temp=head;
              //operation possible without it but tail value can not change so it is necessary to write the below if else block
              if(idx==size()){
                  addAtEnd(value);
                  return;
              }
              else if(idx==0){
                  addAtFirst(value);
                  return;
              }else if(idx<0){
                  System.out.println("Wrong index");
                  return;
              }else if(idx>size()){
                  System.out.println("wrong input");
                  return;
              }

              for(int i=0;i<=idx-1;i++){
                  temp=temp.next;
              }
              t.next=temp.next;
              temp.next=t;
           }

           // get element by its index
        int getElement(int idx){
               if(idx<0||idx>size()){
                   System.out.println("Wrong index");
               }
               Node temp=head;

               for (int i=0;i<=idx;i++){
                temp=temp.next;
               }
               return temp.data;

        }
        void addAtFirst(int value){
            Node newNode=new Node(value);//compulsory to create a new node
            if(head==null){//empty list
                head=tail=newNode;
            }else{//non empty list
                newNode.next=head;
                head=newNode;
            }

        }
        void addAtEnd(int value){
            Node newNode=new Node(value);//compulsory to create a new node
            if(head==null){
                head=newNode;
            }else{
                tail.next=newNode;

            }
            tail=newNode;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
        }


        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                //System.out.print(temp.data +" ");
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
      LinkedList ll=new LinkedList();
      ll.addAtEnd(5);
      ll.addAtEnd(6);
      ll.addAtFirst(2);
      ll.addAtFirst(1);
      ll.insertAt(2,7);
      ll.insertAt(0,89);
      ll.display();
        System.out.println();
        System.out.println("The size of the linkedlist is: "+ll.size());
        System.out.println("Element at this index is: "+ll.getElement(9));
    }

}
