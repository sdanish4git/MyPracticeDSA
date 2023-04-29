package pattern;
/*

Down Mirrored Right Triangle

* * * * *
  * * * *
    * * *
      * *
        *
 */

public class P4 {
    public static void main(String[] args) {
    int n=5;
    printDownMirroredRightTriangle(n);
    }
    public static void printDownMirroredRightTriangle(int n){
        int nsp=0;
        int nst=n;
        for (int i=0;i<n;i++){
            PatternUtil.printSpace(nsp);
            PatternUtil.printStar(nst);
            nsp +=1;
            nst -=1;
            System.out.println();
        }
    }
}
