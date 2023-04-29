package pattern;
/*
Mirrored Right Pascal’s Triangle
         *
       * *
     * * *
   * * * *
 * * * * *
   * * * *
     * * *
       * *
         *
 */

public class P7 {

    public static void main(String[] args) {
        int n=5;
        printMirroredRightPascalTriangle(n);
    }
    public static void printMirroredRightPascalTriangle(int n){
        int nsp=4;
        int nst=1;
        for(int i=0;i<n*2-1;i++){
            PatternUtil.printSpace(nsp);
            PatternUtil.printStar(nst);
            System.out.println();
            if(i <n-1){
                nsp -=1;
                nst +=1;
            }else {
                nsp +=1;
                nst -=1;
            }
        }
    }

}
