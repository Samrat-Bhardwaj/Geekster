import java.util.*;

public class Arrays2 {
    // complete this function
    // https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
    
    public static int search(int arr[], int n, int tar){
        for(int i=0; i<n; i++){
            if(arr[i]==tar){
                return i;
            } 
        }

        // if my compiler at this line, i was not able to return any index
        return -1;
    }

    // find maximum in array
    public static int max_of_array(int[] arr, int n){
        int max=Integer.MIN_VALUE; // why-> bcoz i will always receive values greater than 

        for(int i=0; i<n; i++){
            max=Math.max(arr[i],max);
        }

        return max;
    }

    // find minimum in array
    public static int min_of_array(int[] arr, int n){
        int min=Integer.MAX_VALUE; // it is the max value of integer data type

        for(int i=0; i<n; i++){
            // if(arr[i]<min){
            //     min=arr[i];
            // }
            int v=arr[i];
            min=Math.min(min,v);
        }

        return min;
    }

    //find if duplicates are there in sorted array 
    //n-> size of array
    public static boolean containsDuplicates(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }

        return false;
    }

    //reverse an array

    public static void reverse_array(int[] arr, int n){
        for(int i=0; i<n/2; i++){
            //swap (i) and(n-1-i);
            int temp=arr[i];

            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int[] arr; // declaration
        arr=new int[n]; // initialization 

        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }    

        // int tar=scn.nextInt();

        // int idx=search(arr,n,tar); // returns the index at which target exists, else returns -1
        
        // System.out.println(idx);

        // System.out.println("Maximum of array============");

        // int max=max_of_array(arr, n);
        // System.out.println(max);
        
        // System.out.println("Minimum of array============");

        // int min=min_of_array(arr, n);
        // System.out.println(min);


        // System.out.println("Checking if my sorted array contains duplicate");

        // boolean dup=containsDuplicates(arr, n);

        // if(dup==true){
        //     System.out.println("Yes, it does contain duplicates");
        // } else {
        //     System.out.println("No, it does not contain duplicates");
        // }

        System.out.println("Before reversing the array");
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        reverse_array(arr, n);

        System.out.println("After reversing the array");
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
