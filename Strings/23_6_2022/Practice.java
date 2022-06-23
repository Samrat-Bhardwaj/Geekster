import java.util.*;

public class Practice {
    public static boolean fun(String s1){
        int n=s1.length();

        int[] fre=new int[26];

        for(int i=0; i<n; i++){
            char ch=s1.charAt(i);

            int idx=ch-'a';
            fre[idx]++;
        }
    }
    public static boolean checkPallindrome(String str){
        int n=str.length();

        int i=0;
        int j=n-1;

        while(i<j){
            char charAti=str.charAt(i);
            char charAtj=str.charAt(j);

            if(charAti!=charAtj){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static String reverse(String s){
        String ans="";
        int n=s.length();

        for(int i=n-1; i>=0; i--){
            ans=ans+s.charAt(i);
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String str=scn.nextLine();

        String[] arr=str.split(" ");

        for(int i=0; i<arr.length; i++){
            String s=arr[i];

            String rev=reverse(s);

            System.out.print(rev+" ");
        }
    }
}
