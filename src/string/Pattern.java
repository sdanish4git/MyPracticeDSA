package string;

public class Pattern {

    public static void main(String[] args) {
        solutionOfQ1(5);
        solutionOfQ2(5);
        solutionOfQ3(5);
    }
    public static void solutionOfQ1(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void solutionOfQ2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void solutionOfQ3(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
