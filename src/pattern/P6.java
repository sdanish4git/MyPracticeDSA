package pattern;
/*
K Shape Pattern
* * * * *
* * * *
* * *
* *
*
* *
* * *
* * * *
* * * * *

 */
public class P6 {
    public static void main(String[] args) {
        int n=5;
        printKShape(n);
    }
    public static void printKShape(int n){
        int nst=n;
        for (int i=0;i<n*2-1;i++){
            PatternUtil.printStar(nst);
            if(i<n-1){
                nst -=1;
            }else {
                nst +=1;
            }
            System.out.println();
        }
    }
}
