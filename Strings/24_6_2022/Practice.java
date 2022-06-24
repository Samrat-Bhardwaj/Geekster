public class Practice {
    public static boolean pangram(String str){

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
