import java.util.Scanner;

public class Arrays {
    public static boolean check(int[] arr, int n) {
        if(n<3) return false;

        int i=-1;

        for(i=1; i<n; i++){ // will give me the point from where arr values starts decreasing
            if(arr[i-1]>=arr[i]){
                break;
            }
        }

        if(i==1 || i==n){ // array is non increasing at first point or completely incresing 
            return false;
        }
        //for(declaration;condition;inc/dec)
        for(; i<n; i++){
            if(arr[i-1]<=arr[i]){// if the arr is increasing at any point 
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

        for(int i=0; i<n; i++) {
            arr[i]=scn.nextInt();
        }  

        int tar=scn.nextInt();

        int lo=-1;
        int fo=-1;

        for(int i=0; i<n; i++){
            if(arr[i]==tar){ 
                if(fo==-1){ // i have not yet discovered my target
                    fo=i;
                }

                lo=i;
            }
        }

        System.out.println("first occurence is: "+fo);
        System.out.println("last occurence is: "+lo);


        boolean mountain_array=check(arr,n);

        if(mountain_array){
            System.out.println("Yes it is mountain array");
        } else {
            System.out.println("No it is not mountain array");
        }
    }    
}
