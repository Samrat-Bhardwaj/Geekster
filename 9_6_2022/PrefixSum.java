import java.util.*;

public class PrefixSum {
    // leet 724 ========================================= 
    public int pivotIndex(int[] nums) {
        int n=nums.length;

        int[] pre=new int[n];

        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+nums[i];

            pre[i]=sum;
        }

        for(int i=0; i<n; i++){
            int left_sum;
            if(i==0){
                left_sum=0;
            } else {
                left_sum=pre[i-1];
            }
            
            int right_sum=pre[n-1]-pre[i];

            if(left_sum==right_sum){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int[] arr;
        arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }

        int[] pre=new int[n];

        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+arr[i];

            pre[i]=sum;
        }

        
        int x=scn.nextInt();
        int y=scn.nextInt();

        int range_sum; // sum between index x and y

        if(x==0){
            range_sum=pre[y] - 0; 
        } else {
            range_sum=pre[y] - pre[x-1]; // formula to calculate sum between index x and y
        }

        System.out.println("Sum betwen x and y is " +range_sum);
    }
}
