import java.io.*;
import java.util.*;

public class Solution {
    public static int[][] makeTranspose(int[][] arr, int n, int m){
        int[][] ans=new int[m][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[j][i]=arr[i][j];
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        /* Enteryour code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();

        int[][] arr=new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        
        int[][] ans=makeTranspose(arr,n,m);
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    } 
}