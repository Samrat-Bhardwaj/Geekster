import java.io.*;
import java.util.*;

public class Solution {
    public static int getLuckyPairs(int[] arr, int n){
        int count=0;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int[] arr; // declaration
        arr=new int[n]; // initialization 

        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }  
        
        int count=getLuckyPairs(arr,n);
        
        System.out.println(count);
    }
}