public class Questions {
    // leetcode 1021=================================================================================  
    public String removeOuterParentheses(String s) {
        int a=0;
        
        String ans="";
        
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            
            if(ch=='('){
                if(a!=0){ 
                    ans+=ch;
                }
                
                a++;
            } else {
                if(a!=1){ 
                    ans+=ch;
                }
                
                a--;
            }
        }
        
        return ans;
    }

    // https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1 ============================= 

    // next greater on right ===================================================
    public static long[] nextLargerElement(long[] arr, int n){ 
        long[] ngr=new long[n];

        Stack<Long> st=new Stack<>();

        for(int i=n-1; i>=0; i--){
            long ele=arr[i];

            while(st.size()>0 && st.peek()<=ele){
                st.pop();
            }

            if(st.size()==0){
                ngr[i]=-1;
            } else {
                ngr[i]=st.peek();
            }

            st.push(ele);
        }

        return ngr;
    }

    // next greater on left =================== 

    public static int[] nextGreaterLeft(int[] arr, int n){
        int[] ngl=new int[n];

        Stack<Integer> st=new Stack<>();

        for(int i=0; i<n; i++){
            int ele=arr[i];

            while(st.size()>0 && st.peek()<=ele){
                st.pop();
            }

            if(st.size()==0){
                ngl[i]=-1;
            } else {
                ngl[i]=st.peek();
            }

            st.push(ele);
        }

        return ngl;
    }

    // next greater on right with answers as indices ===================================================
    public static long[] nextLargerElement_right(long[] arr, int n){ 
        long[] ngr=new long[n];

        Stack<Long> st=new Stack<>();

        for(int i=n-1; i>=0; i--){
            long ele=arr[i];

            while(st.size()>0 && arr[st.peek()]<=ele){
                st.pop();
            }

            if(st.size()==0){
                ngr[i]=-1;
            } else {
                ngr[i]=st.peek();
            }

            st.push(i);
        }

        return ngr;
    }

    public static void main(String[] args) {
        
    }
}
