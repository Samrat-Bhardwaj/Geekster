import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Practice {
    public static int getMaxProduct(int[] arr, int n){
        int ans=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int curr_pro=arr[i]*arr[j]*arr[k];

                    ans=Math.max(ans,curr_pro);
                }
            }
        }

        return ans;
    }

    public static int getMaxProduct_better(int[] arr, int n){
        int[] lmax=new int[n];
        int[] lmin=new int[n];

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);

            lmax[i]=max;
            lmin[i]=min;
        }

        int[] rmax=new int[n];
        int[] rmin=new int[n];

        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;

        for(int i=n-1; i>=0; i--){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);

            rmax[i]=max;
            rmin[i]=min;
        }

        int ans=Integer.MIN_VALUE;

        for(int i=1; i<n-1; i++){
            int a=Math.max(lmax[i-1]*arr[i]*rmax[i+1],lmin[i-1]*arr[i]*rmin[i+1]);

            int b=Math.max(lmax[i-1]*arr[i]*rmin[i+1],lmin[i-1]*arr[i]*rmax[i+1]);

            int curr_ans=Math.max(a,b);

            ans=Math.max(ans,curr_ans);
        }

        return ans;
    }

    

    public static void getClosest(int[] arr1,int[] arr2, int tar){
        int diff=Integer.MAX_VALUE;

        int x1=-1;
        int x2=-1;

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                int csum= arr1[i] + arr2[j];
                
                int curr_diff = Math.abs(csum - tar);

                if(curr_diff < diff){
                    x1=arr1[i];
                    x2=arr2[j];

                    diff=curr_diff;
                }
            }
        }

        System.out.println(x1+" "+x2);
    }

    public static void getClosest_better(int[] arr1,int[] arr2, int tar){
        int diff=Integer.MAX_VALUE;
        int n2=arr2.length;
        
        int x1=-1;
        int x2=-1;
        
        int l=0;
        int r=n2-1;

        while(l<arr1.length && r>=0){
            int csum=arr1[l] + arr2[r];
            
            int curr_diff= Math.abs(csum-tar);
            
            if(curr_diff < diff){
                x1=arr1[l];
                x2=arr2[r];

                diff=curr_diff;
            }
            
            if(csum>tar){
                r--;
            } else {
                l++;
            }
        }
        
        System.out.println(x1+" "+x2);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n=scn.nextInt();

        int[] arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }

        System.out.println(getMaxProduct(arr,n));
    }
}
