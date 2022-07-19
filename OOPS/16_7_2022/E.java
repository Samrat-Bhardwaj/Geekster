import java.util.*;
public class MyClass {
    public static int firstOccurance(int arr[],int target){
        int n=arr.length;
        int fo=-1;
        int left=0,right=n-1;
       
        while(left<=right){
              int mid=(left+right)/2;
            if(arr[mid]==target){
                fo=mid;
                right=mid-1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return fo;
    }
    
        public static int lastOccurance(int arr[],int target){
    int n=arr.length;
        int lo=-1;
        int left=0,right=n-1;
      
        while(left<=right){
              int mid=(left+right)/2;
            if(arr[mid]==target){
                lo=mid;
                left=mid+1;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return lo;
    }
    public static void main(String args[]) {
    
    Scann
    