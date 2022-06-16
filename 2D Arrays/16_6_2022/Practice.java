public class Practice {
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
        
    }
}
