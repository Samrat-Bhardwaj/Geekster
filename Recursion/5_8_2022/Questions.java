import java.lang.annotation.Target;

public class Questions {
    public static int max_rec(int[] arr, int idx){
        if(idx==arr.length){
            return Integer.MIN_VALUE;
        }

        int max_aage=max_rec(arr, idx+1);
        
        int ans;
        // ans=Math.max(arr[idx],max_aage);

        if(arr[idx]>max_aage){
            ans=arr[idx];
        } else {
            ans=max_aage;
        }

        return ans;
    }

    // tar=7
    //  arr={2,3,5,7,5,7,24};

    // last occurence
    public static int find_rec(int[] arr, int idx, int tar){
        if(idx==arr.length){
            return -1;
        }

        int f=find_rec(arr, idx+1,tar);

        if(f==-1){
            if(arr[idx]==tar){
                return idx;
            } 
        }

        return f;
    }

    // first occurrence using recursion on the way down
    public static int find_fo(int[] arr, int idx, int tar){
        if(idx==arr.length){
            return -1;
        }

        int f=find_fo(arr, idx+1,tar);

        if(arr[idx]==tar){
            return idx;
        }

        return f;
    }

    // first occurrence using recursion on the way up
    public static int find_fo_better(int[] arr, int idx, int tar){
        if(idx==arr.length){
            return -1;
        }

        if(arr[idx]==tar){
            return idx;
        }

        int ans=find_fo_better(arr, idx+1, tar);
        return ans;
    }

    public static int sum(int[] arr, int idx){
        if(idx==arr.length){
            return 0;
        }

        int sum_aage=sum(arr,idx+1);

        int ans=sum_aage+arr[idx];

        return ans;
    }

    // binary search using recursion =============================================== 
    public static int bs_rec(int[] arr, int tar, int left, int right){
        if(left>right){
            return -1;
        }

        int mid=(left+right)/2;

        if(arr[mid]==tar){
            return mid;
        } else if(arr[mid]>tar){
            return bs_rec(arr, tar, left, mid-1);
        } else {
            return bs_rec(arr, tar, mid+1, right);
        }
    }

    public static int binary_search_handler(int[] arr, int tar){
        int left=0;
        int right=arr.length-1;

        return bs_rec(arr,tar,left,right);
    }

    // Subsequence 
    public static void createSubsequences(String str, int idx, String sub){
        if(idx==str.length()){
            System.out.println(sub);
            return;
        }

        char ch=str.charAt(idx);

        createSubsequences(str, idx+1, sub); // saying no to this character
        createSubsequences(str, idx+1, sub+ch); // saying yes to this character
    }
    public static void main(String[] args) {
        // int[] arr={2,3,5,7,5,7,24};
        // int f=sum(arr, 0);

        // f++;
        // f--;

        // System.out.println(f);
        // // System.out.println(max_rec(arr, 0));
        // System.out.println(find_rec(arr, 0, 7));
        String sub="";
        createSubsequences("abc", 0, sub);
        // System.out.println("this is "+sub);
    }
}
