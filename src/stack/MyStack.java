package stack;

public class MyStack {

    int arr[];
    int top=-1;

    MyStack(int size){
        arr=new int[size];
    }

    public void push(int e){
        if(top == arr.length){
            System.out.println("Stack is Overflow");
        }else{
            arr[++top]=e;
        }
    }
    public int pop(){
        int res=-1;
        if(top ==-1){
            System.out.println("Stack is underflow");
        }else{
            res=arr[top--];
        }
        return res;
    }
    public int peek(){
        int res=-1;
        if(top ==-1){
            System.out.println("Stack is underflow");
        }else{
            res=arr[top];
        }
        return res;
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
}
