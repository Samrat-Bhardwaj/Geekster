import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();

        int[][] arr=new int[n][m];
        // step 1-> input 2d array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        // step 2-> convert to 1d array and sort
        int[] a=new int[n*m];
        
        for(int idx=0; idx<n*m; idx++){
            int x=idx/m;
            int y=idx%m;
            
            a[idx]=arr[x][y];
        }
        
        Arrays.sort(a);
        
        // step-3 -> place 1d array back in 2d array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=a[i*m+j];
            }
        }
        
        // step-4 -> print the 2d array
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}