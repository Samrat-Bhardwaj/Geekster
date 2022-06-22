import java.util.*;

public class Practice {
    public static String convertToIdeal(String str){
        String ans="";

        // checking if first charcater is lowercase, we will change it to uppercase
        char ch=str.charAt(0);

        if('a'<=ch && ch<='z'){
            ch=Character.toUpperCase(ch);
        }

        ans=ans+ch;

        for(int i=1; i<str.length(); i++){
            ch=str.charAt(i);

            if('A'<=ch && ch<='Z'){
                ch=Character.toLowerCase(ch);
            }

            ans=ans+ch;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String str=scn.nextLine();

        // String ans=convertToIdeal(str);

        // System.out.println(ans);

        String[] arr=str.split(" ");

        for(int i=0; i<arr.length; i++){
            String s=arr[i];

            String idealString=convertToIdeal(s);

            System.out.print(idealString+" ");
        }
    }
}
