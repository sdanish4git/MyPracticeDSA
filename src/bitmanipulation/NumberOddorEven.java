package bitmanipulation;

public class NumberOddorEven {

    public static void main(String[] args) {
        int n=5;
        if((n&1)==0) {
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
}
