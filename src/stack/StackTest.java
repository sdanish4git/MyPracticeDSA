package stack;

public class StackTest {
    public static void main(String[] args) {
        //MyStack myStack=new MyStack(5);
        MyStackUsingList myStack=new MyStackUsingList();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
    }
}
