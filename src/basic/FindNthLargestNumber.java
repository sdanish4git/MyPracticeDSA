package basic;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindNthLargestNumber {

    public static void main(String[] args) {
        int a[]={4,2,29,39,50};

        int secondLargest=findNthLargest(a,2);

        System.out.println(secondLargest);
    }

    private static int findNthLargest(int[] a,int n) {
        int largest=-1;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
        }
        if(pq.size()<n){
            return -1;
        }
        for(int i=0;i<n;i++){
            largest=pq.poll();
        }
        return largest;
    }
}
