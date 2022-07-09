import java.util.*;

public class Practice {
    public static void firstLastIndex(int[] arr, int tar){
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

        System.out.println("First occurence is "+fo);
        System.out.println("Last occurence is "+lo);

    }
    // array is decreasing order
    public static int binarySearch_reverse(int[] arr, int tar){
        int n=arr.length;

        int left=0;
        int right=n-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==tar){
                return mid;
            } else if(arr[mid]<tar){
                right=mid-1;
            } else {
                left=mid+1;
            }
        }

        return -1;
    }
    public static int binarySearch(int[] arr, int tar){
        int n=arr.length;

        int left=0;
        int right=n-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==tar){
                return mid;
            } else if(arr[mid]<tar){
                left=mid+1;
            } else {
                right=mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int[] arr={2,2,2,2,2,2,2,2,2,2,7,7,7,7,7,7,7,9,9,11,12,12,12,14,21,44,57,91,91,91,91,91};
        int tar=91;

        firstLastIndex(arr, tar);

        // System.out.println(idx);
    }
}
