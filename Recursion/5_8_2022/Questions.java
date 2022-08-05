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

    public static void main(String[] args) {
        int[] arr={2,3,5,7,5,7,24};
        int f=sum(arr, 0);

        f++;
        f--;

        System.out.println(f);
        // System.out.println(max_rec(arr, 0));
        System.out.println(find_rec(arr, 0, 7));
    }
}
