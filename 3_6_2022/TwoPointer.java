import java.util.*;

public class TwoPointer {
    // (0,i) -> zeros
    // (i+1,j-1) -> ones
    // (j,n-1) -> undefined
    public static void sort_zero_one(int[] arr, int n){
        int i=-1;
        int j=0;

        while(j<n){
            if(arr[j]==0){
                i++; // increasing zeros' area
                swap(arr,i,j);
                j++;
            } else { // increasing ones' area
                j++;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];

        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void reverse(int[] arr, int n){
        int i=0;
        int j=n-1;

        while(i<=j){
            // swap i and j
            // swap(arr,i,j);

            int temp=arr[i];

            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int[] arr; // declaration
        arr=new int[n]; // initialization 

        for(int i=0; i<n; i++) {
            arr[i]=scn.nextInt();
        }  

        System.out.println("Printing array before reversing");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        reverse(arr,n);
        
        System.out.println("Printing array after reversing");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
}
