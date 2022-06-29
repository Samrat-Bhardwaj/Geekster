import java.util.*;

public class Practice {
    public static String removeDuplicateUnsorted(String str){
        String ans="";

        int[] fre=new int[26];

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            int idx=ch-'a';

            if(fre[idx]==0){
                ans=ans+ch;
            }

            fre[idx]++;
        }

        return ans;
    }

    public static String removeDuplicateSorted(String str){
        String ans="";

        ans=ans+str.charAt(0);
        
        for(int i=1; i<str.length(); i++){
            char ch=str.charAt(i);
            char ch_prev=str.charAt(i-1);

            if(ch!=ch_prev){
                ans=ans+ch;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        
        String str=scn.nextLine();
        
        String ans=removeDuplicateUnsorted(str);
        System.out.println(ans);    
    }
}
