package array.basic;

public class RotateArrayByK {
    public static void main(String[] args) {
       /* int ar[]=rotateByK(new int[]{1,2,3,4,5},2);
        for (int e:ar){
            System.out.print(e+" ");
        }*/
        int[] arr = {1, 2, 3, 4, 5};
        int rotations = 2;

        System.out.println("Before rotation: ");
        printArray(arr);

        rotateArrayCounterClockwise(arr, rotations);

        System.out.println("After rotation: ");
        printArray(arr);
    }

    public static int[] rotateByK(int ar[],int k){
        int firstEl=0;
        int i=0;
        while(k>0){
            firstEl=ar[i];
            shiftArray(ar);
            ar[ar.length-1]=firstEl;
            k--;
        }
        return ar;
    }
    public static int[] shiftArray(int ar[]){
        for(int i=1;i<ar.length;i++){
            ar[i-1]=ar[i];
        }
        return ar;
    }

    public static void rotateArrayCounterClockwise(int[] arr, int rotations) {
    rotations = rotations % arr.length;
    reverseArray(arr,0,rotations-1);
    reverseArray(arr,rotations,arr.length-1);
    reverseArray(arr,0,arr.length-1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end --;

        }
    }

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
