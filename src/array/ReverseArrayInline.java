package array;

public class ReverseArrayInline {
    public static void main(String[] args) {
        int a[]={1,2,1,5};

        int revArray[]=reverse(a);
        for (int e:revArray){
            System.out.println(e);
        }
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
