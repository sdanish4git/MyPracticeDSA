package basic;

public class RotateTheNumberByK {

    public static void main(String[] args) {
    int n=12345;
    int a[]={5,6};

    int b[]=a.clone();
    a[0]=9;
        System.out.println(b[0]+"  "+a[0]);

    int k=2;
        System.out.println(rotateNumber(n,k));
    }

    public static int rotateNumber(int n,int k){
        int rotatedNumber=0;
        while(k>0){
            int temp=n%10;
            rotatedNumber=temp+rotatedNumber*10;
            n=n/10;
            k--;
        }
        System.out.println(rotatedNumber);
       /* while(n>0){
            int temp=
        }*/
        return rotatedNumber;
    }
}
