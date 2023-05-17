package matrix;

import java.util.Scanner;

public class Traverse {

    public static void main(String[] args) {
        int mat[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        for (int row=0;row<mat.length;row++){
            for (int col=0;col<mat[0].length;col++){
                System.out.print("Enter value for "+row+" "+col);
                mat[row][col]=sc.nextInt();
            }
        }
        printMatrix(mat);
        System.out.println("Zizac print #######");
        for (int col=0;col<mat[0].length;col++){

           if(col % 2 !=0 ){
               for(int row=mat.length-1;row>=0;row--){
                   System.out.print(mat[row][col]+" ");
               }
           }else{
               for(int row=0;row<mat.length;row++){
                   System.out.print(mat[row][col]+" ");
               }
           }
            //System.out.println();


        }
        System.out.println();
        System.out.println("Zizac print #######2222");
        for (int row=0;row<mat[0].length;row++){

            if(row % 2 !=0 ){
                for(int col=mat[0].length-1;col>=0;col--){
                    System.out.print(mat[row][col]+" ");
                }
            }else{
                for(int col=0;col<mat[0].length;col++){
                    System.out.print(mat[row][col]+" ");
                }
            }
            //System.out.println();


        }

    }

    public static void printMatrix(int m[][]){
        for(int row=0;row<m.length;row++){
            for(int col=0;col<m[row].length;col++){
                System.out.print(m[row][col]+" ");
            }
            System.out.println();
        }
    }
}
