package basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=20;
        while(n>0){
            boolean isPrime=true;
            for(int i=2;i<=n/2;i++){
                if(n%i == 0){
                    isPrime=false;
                    break;
                }
            }
         if(isPrime)   System.out.println(n);
            n--;
        }
    }
}
