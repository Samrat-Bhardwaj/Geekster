public class Main {
    // https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1# ============


    // O(m*n)
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int count=0;
        
        Arrays.sort(a);
        
        for(int i=0; i<n; i++){
            // search a[i];
            if(i>0 && a[i]==a[i-1]){
                continue;
            }
            
            for(int j=0; j<m; j++){
                if(a[i]==b[j]){
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }

    // O(nlogn + mlogm)
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int count=0;
        
        Arrays.sort(a); // O(nlogn)
        Arrays.sort(b); // O(mlogm)
        
        int i=0;
        int j=0;
    
        while(i<n && j<m){ // O(n+m)
            
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            } 
            
            if(a[i]==b[j]){
                count++;
                i++;
                j++;
            } else if(a[i]<b[j]){
                i++;
            } else {
                j++;
            }
        }
        
        
        
        return count;
    }
    public static void main(String[] args) {
        
    }
}
