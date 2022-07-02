import java.util.Scanner;

public class Practice {
    // https://www.hackerrank.com/contests/may-practice-java-dsa/challenges/cc2-03-power-of-a-string/problem

    public static int powerOfString(String str){
        int n=str.length();

        char curr_ch=str.charAt(0);
        int curr_count=1;

        int ans=curr_count;

        for(int i=1; i<n; i++){
            char ch=str.charAt(i);

            if(curr_ch==ch){
                curr_count++;
            } else {
                // ans update
                // curr_count=1
                // curr_ch update

                ans=Math.max(ans,curr_count);
                curr_ch=ch;
                curr_count=1;
            }
        }
        
        ans=Math.max(ans,curr_count);
        return ans;
    }

    // https://www.hackerrank.com/contests/may-practice-java-dsa/challenges/cc4-02-check-pythagoras-triplet

    public static boolean checkPythogeranTriplet(int n){
        for(int a=0; a*a<=n; a++){
            for(int b=0; b*b<=n; b++){
                if(a*a + b*b == n){
                    return true;
                }
            }
        }

        return false;
    }

    // https://www.hackerrank.com/contests/may-practice-java-dsa/challenges/cc5-01-check-subsequence

    public static boolean checksubsequence(String str, String tar){
        int n=tar.length();
        int m=str.length();

        int i=0; // to traverse in tar string
        int j=0; // to traverse in str string

        while(i<n && j<m){
            int char_i=tar.charAt(i);
            int char_j=str.charAt(j);

            if(char_i==char_j){
                i++;
                j++;
            } else {
                i++;
            }
        }

        if(j==m){
            return true;
        } else {
            return false;
        }
    }

    // https://www.hackerrank.com/contests/may22-java-test-7/challenges/cc5-02-add-one
    public static int[] addOne(int[] arr, int n){
        int[] ans=new int[n+1];

        int i=n-1;
        int j=n;
        int carry=0;

        while(i>=0 && j>=0){
            int sum=0;
            if(i==n-1){
                sum=arr[i]+1;
            } else {
                sum=arr[i]+carry;
            }

            if(sum==10){
                carry=1;
                sum=0;
            } else {
                carry=0;
            }

            ans[j]=sum;
            i--;
            j--;
        }

        ans[j]=carry;

        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }

        int[] ans=addOne(arr, n);

        for(int i=0; i<n+1; i++){
            if(i==0 && ans[i]==0){
                continue;
            }

            System.out.print(ans[i]+" ");
        }
    }
}
