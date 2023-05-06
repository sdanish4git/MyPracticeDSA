package pattern;
/*

 * * * * * * * * * *
 * * * *     * * * *
 * * *         * * *
 * *             * *
 *                 *


 */
public class P10 {

    public static void main(String[] args) {
        int n=5;
        printReverV(n);
    }

    public static void printReverV(int n){
        int nst=n;
        int nsp=0;
        for (int row=0;row<n;row++){
            PatternUtil.printStar(nst);
            PatternUtil.printSpace(nsp);
            PatternUtil.printStar(nst);
            System.out.println();
            nst -=1;
            nsp +=2;

        }
    }

}
