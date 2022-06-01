import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int[] arr; // declaration
        arr=new int[n]; // initialization

        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }

        
        System.out.println("Printing array elements ");

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Printing in reverse order");

        for(int i=n-1; i>=0; i--){
            System.out.println(arr[i]);
        }

        System.out.println("Printing in alternate order");

        for(int i=0; i<n; i=i+2){
            System.out.println(arr[i]);
        }

        System.out.println("Printing all the even numbers with their indices");

        for(int i=0; i<n; i++){
            int v=arr[i];

            if(v%2==0){
                System.out.println(v+" at postion "+i);
            }
        }

        System.out.println("Difference of all the even and odd numbers");

        int esum=0;
        int osum=0;

        for(int i=0; i<n; i++){
            int v=arr[i];

            if(v%2==0){
                esum=esum+v;
            } else {
                osum=osum+v;
            }
        }

        System.out.println("The difference is = "+(esum-osum));

        // ques 6 ==================================================================

        System.out.println("Count of elements with index = tar ");

        int tar=scn.nextInt();

        if(tar>=0 && tar<n){
            System.out.println("Only 1 element with index = given target");
        } else {
            System.out.println("0 element with index = given target");
        }
    }
}
