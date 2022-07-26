import java.util.Stack;

public class Qusetions {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;

        int[] ngr=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=n-1; i>=0; i--){
            int ele=nums[i];

            while(st.size()>0 && nums[st.peek()]<=ele){
                st.pop();
            }

            if(st.size()==0){
                ngr[i]=-1;
            } else {
                ngr[i]=nums[st.peek()];
            }

            st.push(i);
        }

        for(int i=n-1; i>=0; i--){
            int ele=nums[i];

            while(st.size()>0 && nums[st.peek()]<=ele){
                st.pop();
            }

            if(st.size()==0){
                ngr[i]=-1;
            } else {
                ngr[i]=nums[st.peek()];
            }

            st.push(i);
        }

        return ngr;
    }

    // https://practice.geeksforgeeks.org/problems/the-celebrity-problem/1 =============== 
    public boolean isCelebrity(int[][] M, int a){
        int n=M.length;
        int i=a;

        // checking ath row
        for(int j=0; j<n; j++){ // O(n)
            if(a==j) continue;
            if(M[i][j]!=0) return false;
        }

        // column ath check
        int j=a;
        for(i=0; i<n; i++){ // O(n)
            if(a==i) continue;

            if(M[i][j]!=1) return false;
        }

        return true;
    }

    int celebrity(int M[][], int n){
        Stack<Integer> st=new Stack<>();

        for(int i=0; i<n; i++){
            st.push(i);
        }

        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();

            if(M[a][b]==0){
                st.push(a); // a can be celebrity 
            } else {
                st.push(b);
            }
        }

        int a=st.pop();
        if(isCelebrity(M, a)) return a;

        return -1;
    }
    public static void main(String[] args) {
        
    }
}
