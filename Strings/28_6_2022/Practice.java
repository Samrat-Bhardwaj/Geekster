public class Practice {
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String str=scn.nextLine();

        int n=str.length();
        int first_occurrence=-1;
        int last_occurrence=-1;

        int last=-1;
        int min_distance=n+1;

        for(int i=0; i<n; i++){
            char ch=str.charAt(i);

            if(isVowel(ch)==true){
                if(first_occurrence==-1){ // i have not yet dicovered any vowel
                    first_occurrence=i;
                }

                last_occurrence=i;

                // finding min distance
                if(last==-1){
                    last=i;
                } else {
                    int distance = i - last;
                    // min_distance=Math.min(min_distance,distance);

                    if(distance < min_distance){
                        min_distance=distance;
                    }

                    last=i;
                }
            }
        }

        int max_distance=last_occurrence-first_occurrence;

        System.out.println("Minimum distance between two vowels is: "+min_distance);
        System.out.println("Maximum distance between two vowels is: "+max_distance);
    }
}
