import java.util.*;

public class TwoPointers {

    public int[] sortedSquares(int[] nums) {
        int n=nums.length;

        int[] ans=new int[n];
        int k=n-1;

        int i=0;
        int j=n-1;

        while(i<=j){
            int isquare=nums[i]*nums[i];
            int jsquare=nums[j]*nums[j];

            if(isquare>jsquare){
                ans[k]=isquare;
                i++;
                k--;
            } else {
                ans[k]=jsquare;
                j--;
                k--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] ans=new int[5];

        arr=
    }
}
