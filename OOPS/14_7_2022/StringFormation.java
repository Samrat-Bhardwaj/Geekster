import java.io.*;
import java.util.*;

public class Solution {
    public static String reverse(String s){
        String ans="";
        
        for(int i=s.length()-1; i>=0; i--){
            ans=ans+s.charAt(i);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        String s=scn.nextLine();
        int op=scn.nextInt();
        scn.nextLine();
        
        while(op>0){
            String input=scn.nextLine();
            String[] work=input.split(" ");
            
            if(work[0].equals("1")){
                s=reverse(s);
            } else {
                if(work[1].equals("1")){
                    s=work[2]+s;
                } else {
                    s=s+work[2];
                }
            }
            op--;
        }
        
        System.out.println(s);
    }
}