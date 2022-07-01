import java.util.Scanner;

public class Practice {
    // https://www.hackerrank.com/contests/may-practice-java-dsa/challenges/cc4-03-is-rotation-possible/copy-from/1346172055

    public static String getSubString(String s, int idx, int len){
        String ans="";

        int si=idx;
        int ei=idx+len-1;

        for(int i=si; i<=ei; i++){
            ans=ans+s.charAt(i);
        }

        return ans;
    }

    public static String getSubString_better(String s, int idx, int len){
        StringBuilder sb=new StringBuilder();

        int si=idx;
        int ei=idx+len-1;

        for(int i=si; i<=ei; i++){
            char ch=s.charAt(i);
            sb.append(ch);
        }

        String ans=sb.toString();
        return ans;
    }

    public static boolean check(String str, String tar){
        String s=str+str;
        int n=str.length();

        for(int i=0; i<n; i++){
            String sub=getSubstring(s,i,n);

            if(sub.equals(tar)){
                return true;
            }
        }

        return false;
    }

    public static boolean check_2(String str, String tar){
        String s=str+str;
        int n=str.length();

        for(int i=0; i<n; i++){
            // String sub=getSubstring(s,i,n);
            String sub=s.substring(i,i+n);

            if(sub.equals(tar)){
                return true;
            }
        }

        return false;
    }

    public static boolean check_3(String str, String tar){
        String s=str+str;

        // for(int i=0; i<n; i++){
        //     // String sub=getSubstring(s,i,n);
        //     String sub=s.substring(i,i+n);

        //     if(sub.equals(tar)){
        //         return true;
        //     }
        // }

        boolean ans=s.contains(tar);

        return ans;
    }

    // https://www.hackerrank.com/contests/may-practice-java-dsa/challenges/locate-the-target-string
    public static int startingIndex(String str, String tar){
        int n=str.length();
        int tar_len=tar.length();

        for(int i=0; i<=(n-tar_len); i++){
            if(str.charAt(i)==tar.charAt(0)){
                String sub=str.substring(i, i+tar_len);

                if(sub.equals(tar)){
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String str=scn.nextLine();
        String tar=scn.nextLine();

        boolean ans=check(str, tar);

        if(ans==true){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
