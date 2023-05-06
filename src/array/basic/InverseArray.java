package array.basic;

import java.util.HashMap;

/*
Inverse an array
// wil explain the question
In this problem you are given a number n, representing the size of array a, followed by n numbers, representing elements of array a.

You are required to calculate the inverse of array a. Since input and output are already managed, your only work is to code a function that will return the user a new array with inverted values.

It is important to mention to you that constraints on the values of input array, is that the values should be between 0 and n (length of input array), with no repetition so that value at each index is unique. It is because when you are inverting the array there are no 2 different values for one index and also leaving one or more index null.

Example: Suppose, value 2 is present at index 3 in the input array so in our result array, at index 2 the value should be 3.

    0  1  2  3  4  5
// {4, 5, 1, 0, 2, 3}; (0-> n-1) wh n -> arr.length; no no missing


    0  1  2  3  4  5 idexes
    3  2  4  5  0  1  ->  Inversed Array

 */
public class InverseArray {

    public static void main(String[] args) {

        int a[]={4, 5, 1, 0, 2, 3};
        inverse(a);
        for (int e:a){
            System.out.println(e);
        }
    }
    public static int[] inverse(int a[]){
        HashMap<Integer,Integer>  indexMap=new HashMap<>();
        for(int i=0;i<a.length;i++){
            indexMap.put(a[i],i);
        }
        for (int i=0;i<a.length;i++){
            a[i]=indexMap.get(i);
        }

        return a;
    }
    public static int findIndex(int a[],int num){
        int index=-1;
       // for (int i=0;i<)
        return 0;
    }
}
