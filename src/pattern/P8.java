package pattern;
/*
Sandglass Star Pattern

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

 */

public class P8 {

    public static void main(String[] args) {
    int n=10;
    printSandglassStarPattern(n);
    }

    public static void printSandglassStarPattern(int n){
        int nst=n*2-1;
        int nsp=0;
        for (int i=0;i<n*2-1;i++){
            PatternUtil.printSpace(nsp);
            PatternUtil.printStar(nst);

            if(i<n-1){
                nst -=2;
                nsp +=1;
            }else{
                nst +=2;
                nsp -=1;
            }
            System.out.println();
        }
    }
}
