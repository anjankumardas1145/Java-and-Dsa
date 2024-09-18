package LINKED_LIST;

public class Add_first {



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
            void addAtFirst(int value){
                Node newNode=new Node(value);//compulsory to create a new node
                if(head==null){//empty list
                    head=tail=newNode;
                }else{//non empty list
                    newNode.next=head;
                    head=newNode;
                }

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
            ll.addAtFirst(5);
            ll.addAtFirst(6);
            ll.display();
            //System.out.println();
          //  System.out.println("The size of the linkedlist is: "+ll.size());

        }

    }


