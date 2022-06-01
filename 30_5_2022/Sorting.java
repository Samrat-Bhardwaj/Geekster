import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void insertion_sort(int[] arr, int n) {

        for(int i=1; i<n; i++){ // we need to insert arr[i] at correct position

            for(int j=i; j>0; j--){ // asking j-1 everytime 
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                } else {
                    break;
                }
            }
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

        System.out.println("Before sorting the array");
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        insertion_sort(arr, n);
        // Arrays.sort(arr); // inbuilt function to sort array

        System.out.println("After sorting the array");
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
