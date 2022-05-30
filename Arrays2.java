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
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }

    // find minimum in array
    public static int min_of_array(int[] arr, int n){
        int min=Integer.MAX_VALUE; // it is the max value of integer data type

        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int[] arr; // declaration
        arr=new int[n]; // initialization 

        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }    

        int tar=scn.nextInt();

        int idx=search(arr,n,tar); // returns the index at which target exists, else returns -1
        
        System.out.println(idx);

        System.out.println("Maximum of array============");

        int max=max_of_array(arr, n);
        System.out.println(max);
        
        System.out.println("Minimum of array============");

        int min=min_of_array(arr, n);
        System.out.println(min);
    }
}
