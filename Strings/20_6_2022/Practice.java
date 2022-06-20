import java.util.Scanner;
public class Practice {
    
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u'){
            return true;
        }
        if(ch=='A' || ch=='I' || ch=='U' || ch=='O' || ch=='E'){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String str=scn.nextLine();

        int n=str.length();
        int count=0;

        for(int i=0; i<n; i++){
            char ch=str.charAt(i);
            
            // if(isVowel(ch)){
            //     count++;
            // }

            if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u'){
                count++;
            }
            if(ch=='A' || ch=='I' || ch=='U' || ch=='O' || ch=='E'){
                count++;
            }
        }

        System.out.println("number of vowels in the string is "+ count);


        System.out.println("Printing the string in reverse============================================");

        for(int i=n-1; i>=0; i--){
            char ch=str.charAt(i);

            System.out.print(ch);
        }

    }
}
