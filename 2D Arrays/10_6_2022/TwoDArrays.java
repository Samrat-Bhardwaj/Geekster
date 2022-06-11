import java.util.*;

class TwoDArrays {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int n=scn.nextInt();

        System.out.println("Enter the number of columns");
        int m=scn.nextInt();

        int[] [] arr=new int[n][m];
        
        System.out.println("Enter "+n*m+" numbers for your matrix");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=scn.nextInt();
            }
        }

        System.out.println("Your matrix is this neo");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }

        int sum=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int ele=arr[i][j];

                sum=sum+ele;
            }
        }

        System.out.println("The sum of whole array is "+sum);


        System.out.println("Printing array in reverse");

        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}