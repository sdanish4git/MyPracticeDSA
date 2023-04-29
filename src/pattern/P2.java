package pattern;
/*
Down Right Triangle
* * * * *
* * * *
* * *
* *
*

 */
public class P2 {
    public static void main(String[] args) {
        drawDownRightTriangle(5);
    }
    public static void drawDownRightTriangle(int n){
        int nst=n;
        int nsp=0;
        for (int i=0;i<n;i++){
            PatternUtil.printStar(nst);
            PatternUtil.printSpace(nsp);
            System.out.println();
            nst -=1;
            nsp +=1;
        }
    }

}
