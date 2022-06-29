import java.util.*;

public class Substring {
    public static String makeString(String str, int sp, int ep){
        String ans="";

        for(int i=sp; i<=ep; i++){
            char ch=str.charAt(i);
            ans=ans+ch;
        }

        return ans;
    }

    public static void generateAllSubstrings(String str){
        int n=str.length();

        for(int sp=0; sp<n; sp++){
            for(int ep=sp; ep<n; ep++){
                String sub=makeString(str, sp, ep);
                System.out.print(sub+" ");
            }
        }
    }

    public static void generateAllSubstrings_better(String str){
        int n=str.length();

        for(int sp=0; sp<n; sp++){
            String sub="";
            for(int ep=sp; ep<n; ep++){
                sub=sub+str.charAt(ep);
                System.out.print(sub+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String str=scn.nextLine();

        generateAllSubstrings_better(str);
    }
}
