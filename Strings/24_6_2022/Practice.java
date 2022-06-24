public class Practice {
    public static boolean pangram(String str){
        int n=str.length();

        int[] fre=new int[26];

        for(int i=0; i<n; i++){
            char ch=str.charAt(i);

            int idx=ch-'a';
            fre[idx]++;
        }

        for(int i=0; i<26; i++){
            if(fre[i]==0){ // ith character is not there in my string 
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String str=scn.nextLine();

        boolean ans=pangram(str);

        if(ans){
            System.out.println("The string is a pangram");
        } else {
            System.out.println("The string is not a pangram");
        }
    }
}
