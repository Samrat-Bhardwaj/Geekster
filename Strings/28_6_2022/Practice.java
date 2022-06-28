import java.util.*;

public class Practice {
    // https://www.hackerrank.com/contests/may-practice-java-dsa/challenges/string-ascii-value

    public static boolean isEqual(String str1, String str2){
        int sum1=0;
        int sum2=0;

        for(int i=0; i<str1.length(); i++){
            char ch=str1.charAt(i);

            int val=ch;
            sum1=sum1+val;
        }

        for(int i=0; i<str2.length(); i++){
            char ch=str2.charAt(i);

            int val=ch;
            sum2=sum2+val;
        }        

        if(sum1==sum2){
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkBalanced(String str){
        int n=str.length();
        int first_half=0;
        int second_half=0;

        if(n%2==0){
            // calculating first half
            for(int i=0; i<n/2; i++){
                char ch=str.charAt(i);

                int val=ch-'0';
                first_half=first_half+val;
            }

            // calculating second half
            for(int i=n/2; i<n; i++){
                char ch=str.charAt(i);

                int val=ch-'0';
                second_half=second_half+val;
            }
        } else { // in case of odd length string 
            // calculating first half
            for(int i=0; i<n/2; i++){
                char ch=str.charAt(i);

                int val=ch-'0';
                first_half=first_half+val;
            }

            // calculating second half
            for(int i=n/2 + 1; i<n; i++){
                char ch=str.charAt(i);

                int val=ch-'0';
                second_half=second_half+val;
            }  
        }

        if(first_half==second_half){
            return true;
        } else {
            return false;
        }
    }

    public static int stringToInteger(String str){
        // convert the input "str" to "integer"
        int ans=Integer.parseInt(str);
        return ans;
    } 

    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String str=scn.nextLine();

        // int n=str.length();
        // int first_occurrence=-1;
        // int last_occurrence=-1;

        // int last=-1;
        // int min_distance=n+1;

        // for(int i=0; i<n; i++){
        //     char ch=str.charAt(i);

        //     if(isVowel(ch)==true){
        //         if(first_occurrence==-1){ // i have not yet dicovered any vowel
        //             first_occurrence=i;
        //         }

        //         last_occurrence=i;

        //         // finding min distance
        //         if(last==-1){
        //             last=i;
        //         } else {
        //             int distance = i - last;
        //             // min_distance=Math.min(min_distance,distance);

        //             if(distance < min_distance){
        //                 min_distance=distance;
        //             }

        //             last=i;
        //         }
        //     }
        // }

        // int max_distance=last_occurrence-first_occurrence;

        // System.out.println("Minimum distance between two vowels is: "+min_distance);
        // System.out.println("Maximum distance between two vowels is: "+max_distance);

        int ans=stringToInteger(str);
        System.out.println(ans);
    }
}
