import java.util.*;

public class Practice {
    public static boolean checkAnagram(String str1, String str2){
        int n1=str1.length();
        int n2=str2.length();

        int[] fre1=new int[26]; // will store the frequencies of every element of str1
        for(int i=0; i<n1; i++){
            char ch=str1.charAt(i);

            int idx=ch-'a';
            fre1[idx]++;
        }

        int[] fre2=new int[26]; // will store the frequencies of every element of str2
        for(int i=0; i<n2; i++){
            char ch=str2.charAt(i);

            int idx=ch-'a';
            fre2[idx]++;
        }

        for(int i=0; i<26; i++){
            if(fre1[i]!=fre2[i]){ // frequency of ith character is not equal
                return false;
            }
        }

        return true;
    }

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
