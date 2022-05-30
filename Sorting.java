import java.util.Scanner;

class Sorting {
    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];

        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    // selection sort ======================================================= 
    public static void selection_sort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int min_idx=i;

            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }

            swap(arr,i,min_idx);
        }
    }

    // bubble sort ========================================================

    public static void bubble_sort(int[] arr, int n){

        for(int i=0; i<n-1; i++){  // more than one iterations will be required 

            for(int idx=0; idx<n-1-i; idx++){
                if(arr[idx]>arr[idx+1]){
                    // swap idx and (idx+1)

                    // swap(arr,idx,idx+1);
                    int temp=arr[idx];
                    
                    arr[idx]=arr[idx+1];
                    arr[idx+1]=temp;
                }
            }

        }
    }

    // assignment ques 38 ====================================================

    public static boolean check_sorting(int[] arr, int n){
        for(int i=1; i<n; i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int[] arr; // declaration
        arr=new int[n]; // initialization 

        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }  

        System.out.println("Before sorting the array");
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        bubble_sort(arr, n);

        System.out.println("After sorting the array");
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}