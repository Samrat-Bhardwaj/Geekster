import java.util.Scanner;

public class Practice {
    public static String decimalToBinary(int n){
        String binary="";

        while(n>0){
            int rem=n%2;

            binary= rem + binary;
            n=n/2;
        }
        return binary;
    }

    public static int binaryToDecimal(String binary){
        int n=binary.length();

        int curr_pow=1;
        int decimal=0;

        for(int i=n-1; i>=0; i--){
            char ch=binary.charAt(i);

            if(ch=='1'){
                decimal=decimal+curr_pow;
            }

            curr_pow=curr_pow*2;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        // int n=scn.nextInt();

        // String binary=decimalToBinary(n);

        // System.out.println(binary);

        String binary=scn.nextLine();

        int decimal=binaryToDecimal(binary);

        System.out.println(decimal);
    }
}
