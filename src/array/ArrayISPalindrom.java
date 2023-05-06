package array;

public class ArrayISPalindrom {

    public static void main(String[] args) {
        int a[]={1,2,1,5};
        System.out.println(isPalindrom(a));
        int revArray[]=reverse(a);
        for (int e:revArray){
            System.out.println(e);
        }

    }
    public static boolean isPalindrom(int a[]){
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[i] != a[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static int[] reverse(int a[]){
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return a;
    }
}
