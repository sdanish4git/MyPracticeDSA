import java.util.ArrayList;

public class BlindlySoluiton {

    public static void main(String[] args) {
        int[][] intervals={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInter={4,8};
        int[][] outPut=intervals(intervals,newInter);
        String outStr="[";
        for(int i=0;i<outPut.length;i++){
                outStr =outStr+"[";
            for(int j=0;j<outPut[i].length;j++){
                outStr =outStr+outPut[i][j]+",";
            }
            outStr =outStr+"],";
        }
        outStr =outStr+"]";
        System.out.println(outStr);
    }
    public static int[][]  intervals(int[][] intervals,int[] newInterval){
        ArrayList<int[]>  intervalList=new ArrayList<>();
        int[][] result=null;
        for(int i=0;i<intervals.length;i++){

            if(newInterval[1]<intervals[i][0]){
                intervalList.add(newInterval);
                while(i<intervals.length){
                    intervalList.add(intervals[i]);
                    i++;
                }
                result=new int[intervalList.size()][2];
                return intervalList.toArray(result);
            }else if(newInterval[0]>intervals[i][1]){
                intervalList.add(intervals[i]);
            }else{
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1] );
            }
        }

        intervalList.add(newInterval);
        result=new int[intervalList.size()][2];
         intervalList.toArray(result);
        return result;

    }
}
