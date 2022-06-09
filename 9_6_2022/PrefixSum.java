import java.util.*;

public class PrefixSum {
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

        int range_sum=0; // sum between index x and y

        if(x==0){
            range_sum=pre[y] - 0; 
        } else {
            range_sum=pre[y] - pre[x-1]; // formula to calculate sum between index x and y
        }

        System.out.println("Sum betwen x and y is " +range_sum);
    }
}
