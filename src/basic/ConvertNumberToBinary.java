package basic;

public class ConvertNumberToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(11));
    }
    public static String decimalToBinary(int n){
        String r="";
        while(n>0){
            int reminder=n%2;
            n=n/2;
            r=reminder+r;

        }
        return r;
    }
}
