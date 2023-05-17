package array;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        int nums[]={1,2,3};
        subarraySum(nums,3);
    }
    public static int subarraySum(int[] nums, int k) {

        int count=0;
        int l=0;
        int r=0;
        int sum=0;
        while(r<nums.length){
            sum=sum+nums[r];
            if(sum==k){
                sum=sum-nums[l];
                l++;
                r++;
                count++;

            }else if(sum>k){
                sum=sum-nums[l];
                l++;
                //r++;
            }else{
                r++;
            }

        }
        return count;

    }
}
