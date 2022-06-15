public class Wave {
    public static void printRowWave(int[][] arr, int n, int m){
        for(int row=0; row<n; row++){
            if(row%2==0){ // if row is even
                for(int col=0; col<m; col++){
                    System.out.print(arr[row][col]+" ");
                }
            } else {
                for(int col=m-1; col>=0; col--){
                    System.out.print(arr[row][col]+" ");
                }
            }
            
            System.out.println();
        }
    }
    
    public static void columnWave(int[][] arr, int n, int m){
        
        for(int col=0;col<m; col++){
            if(col%2==0){
                for(int row=0; row<n; row++){
                    System.out.print(arr[row][col]+" ");
                }
            } else {
                for(int row=n-1; row>=0; row--){
                    System.out.print(arr[row][col]+" ");    
                }
            }
            
            System.out.println();
        }
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

    }
}
