import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int first_missing_positive(int[] arr, int n){
        // removing negative numbers as they cant be our answer
        for(int i=0; i<n; i++){
            if(arr[i]<=0){
                arr[i]=2*n;
            }
        }
        
        // marking numbers from 1 to n in our array
        for(int i=0; i<n; i++){
            int ele=Math.abs(arr[i]); // taking absolute value
            
            if(ele<=n && arr[ele-1]>0){
                arr[ele-1]=arr[ele-1]*(-1);
            }
        }
        
        // finding the index with positive element
        for(int i=0; i<n; i++){
            if(arr[i]>=0){ // i+1 does not exist in my array
                return i+1;
            }
        }
        
        return n+1;
    }
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scn=new Scanner(System.in);
        
        int n=scn.nextInt();
        
        int[]arr=new int[n];
        
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        
        int ans=first_missing_positive(arr,n);
        System.out.println(ans);
    }
}