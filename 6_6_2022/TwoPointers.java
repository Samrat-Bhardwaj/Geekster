import java.util.*;

public class TwoPointers {
    // (0,p1) -> zeros
    // (p1+1,p2-1) -> ones
    // (p2,p3) -> unknown 
    // (p3+1,n-1) -> twos
    public static void sort_zero_one_two(int[] arr, int n){
        int p1=-1;
        int p2=0;
        int p3=n-1;

        while(p2<=p3){ // unknown area alive 
            if(arr[p2]==0){
                p1++; // increase zero area
                swap(arr,p1,p2); // swapping 0 and 1
                p2++; 
            } else if(arr[p2]==2){
                swap(arr,p2,p3);
                p3--;
            } else { // arr[p2]==1 
                p2++;
            }
        }
    }

    public static void swap(int[] arr, int x, int y){
        int temp=arr[x];

        arr[x]=arr[y];
        arr[y]=temp;
    }

    // segregate even and odd ================

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int[] arr; // declaration
        arr=new int[n]; // initialization 

        for(int i=0; i<n; i++) {
            arr[i]=scn.nextInt();
        }  

        System.out.println("Printing array before sorting");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        sort_zero_one_two(arr,n);
        
        System.out.println("Printing array after sorting");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
}
