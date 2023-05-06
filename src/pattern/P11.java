package pattern;
/*
                        nst   nsp  nst
 *                 *     1    8     1
 * *             * *     2    6     2
 * * *         * * *
 * * * *     * * * *
 * * * * * * * * * *
 * * * *     * * * *
 * * *         * * *
 * *             * *
 *                 *



 */

public class P11 {

    public static void main(String[] args) {
    int n=5;
    printHShape(n);
    }

    public static void printHShape(int n){
        int nst=1;
        int nsp=n*2-2;
        for(int row=0;row<n*2-1;row++){
            PatternUtil.printStar(nst);
            PatternUtil.printSpace(nsp);
            PatternUtil.printStar(nst);
            System.out.println();
            if(row < n-1 ){
                nst++;
                nsp -=2;
            }else{
                nst --;
                nsp +=2;
            }
        }
    }
}
