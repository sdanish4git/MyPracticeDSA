package pattern;
/*
Pattern-3 (Mirrored Right Triangle)
Mirrored Right Triangle
         *
       * *
     * * *
   * * * *
 * * * * *
 */
public class P3 {
    public static void main(String[] args) {
    int n=5;
    printMirroredRightTriangle(n);
    }
    public static void printMirroredRightTriangle(int n){
        int nst=1;
        int nsp=n-1;
        for (int i=0;i<n;i++){
            PatternUtil.printSpace(nsp);
            PatternUtil.printStar(nst);
            System.out.println();
            nsp -=1;
            nst +=1;
        }
    }
}
