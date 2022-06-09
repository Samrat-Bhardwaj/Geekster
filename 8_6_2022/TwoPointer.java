import java.util.*;

public class TwoPointer {
    // two sum brute ================================================================ 
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int n=nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }

        return ans;
    }

    // count of distinct pair with given sum
    public static int countPairs(int[] nums, int target){
        Arrays.sort(nums);

        int n=nums.length;

        int i=0;
        int j=n-1;
        int count=0;

        while(i<j){
            int sum=nums[i] + nums[j];

            if(sum==target){
                count++;
                i++;
                j--;
            } else if(sum < target){
                i++;
            } else {
                j--;
            }
        }

        return count;
    }

    public static int countTriplet(int[] nums, int target){
        Arrays.sort(nums); //nlogn
        int n=nums.length;

        int count=0;

        for(int k=0; k<n-2; k++){
            int i=k+1;
            int j=n-1;

            int required_sum=tar-nums[k];

            while(i<j){
                int sum=nums[i] + nums[j];

                if(sum==required_sum){
                    count++;
                    i++;
                    j--;
                } else if(sum<required_sum){
                    i++;
                } else {
                    j--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{-1,11,-2,5,13,9,4,-4,15};
        int target=9;

        System.out.println("Total number of pairs = "+countPairs(nums,target));
    }
}
