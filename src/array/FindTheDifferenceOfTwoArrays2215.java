package array;

import java.util.*;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays2215 {

    public static void main(String[] args) {
        int nums1[] = {1,2,3};
        int nums2[] = {2,4,6};
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result=new ArrayList<>();

        List<Integer> firstList= new ArrayList<>();
        for(int n:nums1){
            firstList.add(n);
        }
        List<Integer> secondList=new ArrayList<>();
        for(int n:nums2){
            secondList.add(n);
        }
        Set<Integer> array1=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(!secondList.contains(nums1[i])){
               array1.add(nums1[i]);
            }
        }
        Set<Integer> array2=new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(!firstList.contains(nums2[i])){
                array2.add(nums2[i]);
            }
        }
        result.add(array1.stream().collect(Collectors.toList()));
        result.add(array2.stream().collect(Collectors.toList()));
        return result;

    }
}
