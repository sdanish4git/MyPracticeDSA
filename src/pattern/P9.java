package pattern;
/*

 *                *
 * *            * *
 * * *        * * *
 * * * *    * * * *
 * * * * * * * * * *

 */

public class P9 {
    public static void main(String[] args) {
        int n=5;
    printV(n);
    }
    public static void printV(int n){
        int nst1=1;
        int nst2=1;
        int nsp=n*2-2;
        for(int row=0;row<n;row++) {
            PatternUtil.printStar(nst1);
            PatternUtil.printSpace(nsp);
            PatternUtil.printStar(nst2);
            nst1 += 1;
            nst2 += 1;
            nsp -= 2;
            System.out.println();
        }
    }
}
