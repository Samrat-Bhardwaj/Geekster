import java.io.*;
import java.util.*;

public class Solution {
    public static int[][] multiplyMatrix(int[][] A, int n1, int m1, int[][]B, int n2,int m2){
        int[][] C=new int[n1][m2];
        
        for(int i=0; i<n1; i++){
            for(int j=0; j<m2; j++){
                int ans=0;
                
                for(int k=0; k<m1; k++){
                    ans=ans+(A[i][k]*B[k][j]);
                }
                
                C[i][j]=ans;
            }
        }
        
        return C;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int n1=scn.nextInt();
        int m1=scn.nextInt();
        
        int[][] A=new int[n1][m1];
        
        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++){
                A[i][j]=scn.nextInt();
            }
        }
        
        int n2=scn.nextInt();
        int m2=scn.nextInt();
        
        int[][] B=new int[n2][m2];
        
        for(int i=0; i<n2; i++){
            for(int j=0; j<m2; j++){
                B[i][j]=scn.nextInt();
            }
        }
        
        if(m1!=n2){
            System.out.println("-1");
        } else {
            int[][] C=multiplyMatrix(A,n1,m1,B,n2,m2);
            
            for(int i=0; i<n1; i++){
                for(int j=0; j<m2; j++){
                    System.out.print(C[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}