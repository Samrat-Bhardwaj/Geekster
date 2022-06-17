import java.io.*;
import java.util.*;

public class Solution {
    // https://www.hackerrank.com/contests/may-practice-java-dsa/challenges/cc3-02-convert-1-d-array-to-2-d-array/copy-from/1345793645
    
    public static int[][] convert1Dto2D(int[] arr, int n, int rows, int cols){
        
        int[][] ans=new int[rows][cols];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                ans[i][j]=arr[i*cols+j];
            }
        }
        return ans;
    }

    // https://www.hackerrank.com/contests/may-practice-java-dsa/challenges/cc2-04-diagonal-sum/copy-from/1345792814

    public static int getDiagonalSum(int[][] arr, int n){
        int sum=0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if((i==j) || (i+j==n-1)){
                    sum=sum+arr[i][j];
                }
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int[] arr=new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        
        int rows=scn.nextInt();
        int cols=scn.nextInt();
        
        int[][] ans=convert1Dto2D(arr,n,rows,cols);
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}