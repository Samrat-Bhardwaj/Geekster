public class Questions {
    // leet 239 ==================== 
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        
        int[] ans=new int[n-k+1];
        
        // indices of next greater element
        int[] ngr=new int[n];
        
        Stack<Integer> st=new Stack<>();
        
        for(int i=n-1; i>=0; i--){
            int ele=nums[i];
            
            while(st.size()>0 && nums[st.peek()]<=ele){
                st.pop();
            }
            
            if(st.size()==0){
                ngr[i]=n;
            } else {
                ngr[i]=st.peek();
            }
            
            st.push(i);
        }
        
        int idx=0; // stores the maximum element index of current window
        for(int sp=0; sp<=(n-k); sp++){ 
            if(idx<sp){
                idx=sp;
            }
            
            int ep=sp+k-1;
            
            while(ngr[idx]<=ep){
                idx=ngr[idx];
            }
            
            ans[sp]=nums[idx];
        }
        
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
