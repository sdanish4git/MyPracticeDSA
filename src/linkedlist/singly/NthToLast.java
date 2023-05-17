package linkedlist.singly;

public class NthToLast {
    //1>2>3>4>5>6  n=2 output=5;
    public static void main(String[] args) {
        int n=3;
        SinglyLinkedList list=new SinglyLinkedList(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.traverse();
        Node output=nthNodetoLast(list,n);
        System.out.println();
        System.out.println(output.value);
    }

    private static Node nthNodetoLast(SinglyLinkedList list, int n) {

        Node p1=list.head;
        Node p2=list.head;

        for(int i=0;i<n;i++){
            if(p2 == null) return null;
            p2=p2.next;
        }
        while(p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}
