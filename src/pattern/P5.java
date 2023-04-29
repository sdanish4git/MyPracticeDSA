package pattern;
/*
Right Pascal’s Triangle
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
public class P5 {
    public static void main(String[] args) {
        int n=5;
        printRightPascalTriangle(n);
    }
    public static void printRightPascalTriangle(int n){
        int nst=1;
        for(int i=0;i<n*2-1;i++){
            PatternUtil.printStar(nst);
            if(i<n-1){
                nst +=1;
            }else{
                nst -=1;
            }
            System.out.println();
        }
    }
}
