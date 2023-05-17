package array;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
    int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> result=threeSum(nums);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets=new HashSet<>();
        if(nums.length <3) return new ArrayList<>(triplets);
        if(nums.length == 3){
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum +=nums[i];
            }
            if(sum == 0){
                triplets.add(Arrays.asList(nums[0],nums[1],nums[2]));
            }
        }
        for(int p1=0;p1<nums.length-3;p1++){
            int p2=p1+1;
            int p3=nums.length-1;
            Arrays.sort(nums);
            while(p2<p3){
                int sum=nums[p2]+nums[p3];
                if(sum==-nums[p1]){
                    triplets.add(Arrays.asList(nums[p1],nums[p2],nums[p3]));
                    p2++;
                    p3--;
                }else if(sum>-nums[p1]){
                    p3--;
                }else if(sum <-nums[p1]) {
                    p2++;
                }

            }
        }
        return new ArrayList<>(triplets);
    }
}
