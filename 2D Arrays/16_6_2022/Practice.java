import java.util.*;

public class Practice {
    //transpose of a matrix,for identity matrix ============================================== 
    static void transpose(int arr[][], int n)
    {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i<j){ // swap arr[i][j] with arr[j][i];
                    int temp=arr[i][j];
                    
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
    }


    public static boolean checkIdentityMatrix(int[][] arr, int n, int m){
        if(n!=m){
            return false;
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    if(arr[i][j]!=1){
                        return false;
                    }
                } else {
                    if(arr[i][j]!=0){
                        return false;
                    }
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();

        int[][] arr=new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=scn.nextInt();
            }
        }

        System.out.println(checkIdentityMatrix(arr,n,m));
    }
}
