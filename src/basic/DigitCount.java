package basic;

public class DigitCount {
    public static void main(String[] args) {
        System.out.println(countDigit(23499995));
    }
    public static int countDigit(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;

        }
        return count;
    }
}
