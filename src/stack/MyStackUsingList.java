package stack;

import java.util.ArrayList;

public class MyStackUsingList {
    ArrayList<Integer>  al;

    MyStackUsingList(){
        al=new ArrayList<>();
    }
    public void push(int el){
        al.add(el);
    }
    public int pop(){
        return al.remove(al.size()-1);
    }
    public int peek(){
        return al.get(al.size()-1);
    }
    public boolean isEmpty(){
        if(al.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}
