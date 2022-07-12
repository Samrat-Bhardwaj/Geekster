import java.util.*;

public class Practice {
    public static int total_elements(int[] arr, int tar){
        int n=arr.length;

        int left=0;
        int right=n-1;

        int fo=-1;
        int lo=-1;

       while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==tar){
                fo=mid;
                right=mid-1;
            } else if(arr[mid]<tar){
                left=mid+1;
            } else {
                right=mid-1;
            }
       }

       left=0;
       right=n-1;

       while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==tar){
                lo=mid;
                left=mid+1;
            } else if(arr[mid]<tar){
                left=mid+1;
            } else {
                right=mid-1;
            }
       }

        int total_elements= lo - fo + 1;
        return total_elements;
    }

    // https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1/

    int transitionPoint(int arr[], int n) {
        int left=0;
        int right=n-1;

        int fo=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==1){
                fo=mid;
                right=mid-1;
            } else if(arr[mid]<1){
                left=mid+1;
            } else {
                right=mid-1;
            }
        }

        return fo;
    }

    // find next greater ============================================================ 

    public static int find_index_of_just_greater(int[] arr, int tar){
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]<=tar){
                left=mid+1;
            } else {
                right=mid-1;
            }
        }

        if(left==arr.length) return -1;
        
        return left;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int[] arr={2,2,2,2,2,2,2,2,2,2,7,7,7,7,7,7,7,9,9,11,12,12,12,14,21,44,57,91,91,91,91,91};
        int tar=2;

        int ans=find_index_of_just_greater(arr,tar);

        System.out.println(ans);
    }
}
