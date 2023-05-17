package linkedlist.singly;

public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList=new SinglyLinkedList(4);
        singlyLinkedList.insertAtBegin(3);
        singlyLinkedList.insertAtEnd(5);
        singlyLinkedList.insertAtMiddle(7,1);
        singlyLinkedList.traverse();
        System.out.println();
        singlyLinkedList.deleteAtBegin();
        singlyLinkedList.deleteAtEnd();
        singlyLinkedList.traverse();

    }
}
