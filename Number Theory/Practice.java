import java.util.Scanner;

public class Practice {
    public static int hcf(int a, int b){
        int divisor=a;
        int dividend=b;

        while(divisor>0){
            int remainder=dividend % divisor;

            dividend=divisor;
            divisor=remainder;
        }

        return dividend; 
    }
    
    public static int count_common_elements(int[] arr1, int n1, int[] arr2, int n2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0;
        int j=0;
        int count=0;

        while(i<n1 && j<n2){
            if(i>0 && arr1[i-1]==arr1[i]){
                i++;
                continue;
            }

            if(arr1[i]<arr2[j]){
                i++;
            } else if(arr1[i]>arr2[j]){
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }

        return count;
    }

    public static void printIntersection(int[] arr1, int[] arr2, int n1, int n2){
        for(int i=0; i<n1; i++){
            int ele=arr1[i];

            for(int j=0; j<n2; j++){
                if(arr2[j]==ele){
                    System.out.print(ele+" ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int n1=scn.nextInt();

        int[] arr1=new int[n1];

        for(int i=0; i<n1; i++){
            arr1[i]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int[] arr2=new int[n2];

        for(int i=0; i<n2; i++){
            arr2[i]=scn.nextInt();
        }

        printIntersection(arr1,arr2,n1,n2);
    }
}
