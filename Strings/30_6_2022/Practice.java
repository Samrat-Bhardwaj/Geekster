public class Practice {
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='u' || ch=='o'){
            return true;
        }

        return false;
    }

    // https://www.hackerrank.com/contests/may-practice-java-dsa/challenges/sum-of-all-substrings/problem

    public static int sumOfSubstrings(String str){
        int ans=0;
        int n=str.length();

        for(int sp=0; sp<n; sp++){
            String sub="";
            for(int ep=sp; ep<n; ep++){
                sub=sub+str.charAt(ep);

                int number=Integer.parseInt(sub);

                ans=ans+number;
            }
        }

        return ans;
    }

    public static int sumOfSubstrings_better(String str){
        int n=str.length();

        int ans=0;

        for(int sp=0; sp<n; sp++){
            int num=0;
            for(int ep=sp; ep<n; ep++){
                char ch=str.charAt(ep);
                
                int digit=ch-'0';
                num=num*10+digit;

                ans=ans+num;
            }
        }

        return ans;
    }

    public static int countWithEndCharactersSame(String str){
        int ans=0;
        int n=str.length();

        for(int sp=0; sp<n; sp++){
            for(int ep=sp; ep<n; ep++){
                char ch_sp=str.charAt(sp);
                char ch_ep=str.charAt(ep);

                if(ch_sp==ch_ep){
                    ans++;
                }
            }
        }

        return ans;
    }

    public static int countSubstringsWithoutVowel(String str){
        int n=str.length();

        int count=0;

        for(int sp=0; sp<n; sp++){
            for(int ep=sp; ep<n; ep++){
                char ch=str.charAt(ep);

                if(isVowel(ch)){
                    break;
                }
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String str=scn.nextLine();

        int ans=countSubstringsWithoutVowel(str);
        System.out.println(ans);
    }
}
