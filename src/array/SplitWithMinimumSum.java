package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitWithMinimumSum {
    public static void main(String[] args) {
    int nums=4325;
        System.out.println(splitNum(nums));
    }
    public static int splitNum(int num) {

        String s=String.valueOf(num);
        char numChar[]=s.toCharArray();
        Arrays.sort(numChar);
        s=new String(numChar);
        String nums1="";
        String nums2="";
        for(int i=0;i<s.length();i++){
            if(i % 2 == 0){
                nums1 +=s.charAt(i);
            }else{
                nums2 +=s.charAt(i);
            }
        }
        return Integer.parseInt(nums1)+Integer.parseInt(nums2);

    }
}
