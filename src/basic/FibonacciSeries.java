package basic;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n=10;
        fibIterative(n);
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
    }

    public static void fibIterative(int n){
        int n1=0;
        int n2=1;
        int n3=0;
        int count=0;
        while(count<n){
            System.out.print(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
            count++;
        }
    }
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

}
