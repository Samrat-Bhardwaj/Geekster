import java.io.*;
import java.util.*;

public class Solution {
    // rotate array 

    public static void transpose(int arr[][], int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i<j){ // swap arr[i][j] with arr[j][i];
                    int temp=arr[i][j];
                    
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
    }
    
    public static void rotateBy90Degrees(int[][] arr, int n){
        transpose(arr,n);
        
        for(int row=0; row<n; row++){
            // reverse the whole row
            
            int i=0;
            int j=n-1;
            
            while(i<j){
                // swap arr[row][i],arr[row][j]
                
                int temp=arr[row][i];
                
                arr[row][i]=arr[row][j];
                arr[row][j]=temp;
                
                i++;
                j--;
            }
        }
    }
    
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