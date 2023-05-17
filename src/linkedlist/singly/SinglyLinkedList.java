package linkedlist.singly;

public class SinglyLinkedList {

    Node head;
    Node tail;
    int size;

    SinglyLinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        size=1;
    }

    public void insertAtBegin(int value){
        Node newNode=new Node(value);
        if(head == null){
            head=newNode;
            tail=head;
            size=size+1;
            return;
        }
        newNode.next=head;
        head=newNode;
        size=size+1;
    }
    public void insertAtEnd(int value){
        Node newNode=new Node(value);
        if(head == null){
            head=newNode;
            tail=head;
            size +=1;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        size +=1;
    }
    public void insertAtMiddle(int value,int position){

        if(position <0){
            position=0;
        }
        if(position > size){
            position=size;
        }

        if(head == null){
            head=new Node(value);
        }else if(position ==0){
            Node newNode=new Node(value);
            newNode.next=head;
            head=newNode;
        }else{
            Node newNode=new Node(value);
            Node current=head;
            for(int i=0;i<position;i++){
                current=current.next;
            }
            newNode.next=current.next;
            current.next=newNode;
        }
        size++;
    }
    public void deleteAtBegin(){
        if(head==null){
            return ;
        }
        head=head.next;
        size--;
    }
    public void deleteAtEnd(){
        if(head == null){
            return;
        }
        Node current=head;
        while(current.next.next !=null){
            current=current.next;
        }
        current.next=null;
        size--;

    }
    public void traverse(){
        Node current=head;
        for(int i=1;i<=size;i++){
            System.out.print(current.value);
            if(i != size){
                System.out.print(" > ");
            }
            current=current.next;
        }
    }

}
