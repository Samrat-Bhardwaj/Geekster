public class Questions {
    // check if sum of every row is equal

    public static boolean is_row_sum_equal(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        int first_row_sum=0;

        int row=0;
        for(int col=0; col<m; col++){
            first_row_sum=first_row_sum+arr[row][col];
        }

        for(int i=1; i<n; i++){
            int row_sum=0;

            for(int j=0; j<m; j++){
                row_sum=row_sum+arr[i][j];
            }

            if(first_row_sum!=row_sum){
                return false;
            }
        }

        return true;
    }

    // returns true if arr1,arr2 is same else false
    public static boolean isSame(int[][] arr1, int[][] arr2){
        int n1=arr1.length;
        int m1=arr1[0].length;

        int n2=arr2.length;
        int m2=arr2[0].length;

        if(n1!=n2 || m1!=m2){
            return false;
        }

        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++){
                if(arr1[i][j]!=arr2[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
    // return true if arr contains target, else return false
    public static boolean search(int[][] arr, int tar){
        int n=arr.length;
        int m=arr[0].length;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==tar){
                    return true;
                }
            }
        }
        
        return false;
    }

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

        int tar=scn.nextInt();
    }
}
