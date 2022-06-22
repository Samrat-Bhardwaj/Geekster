import java.util.*;

public class Practice {
    public static int countSpaces(String str){
        int n=str.length();
        int count=0;

        for(int i=0; i<n; i++){
            char ch=str.charAt(i);

            if(ch==' '){
                count++;
            }
        }

        return count;
    }

    public static void printAlternateElements(String str){
        int n=str.length();
        
        for(int i=0; i<n; i=i+2){
            char ch=str.charAt(i);
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String str=scn.nextLine();
    
        int count=countSpaces(str);

        System.out.println("Number of spaces in this string is "+count);

        printAlternateElements(str);

        int len=str.length();

        if(len%3==0){
            System.out.println("String length is divisible by 3");
        } else {
            System.out.println("String length is not divisble by 3");
        }
    }
}
