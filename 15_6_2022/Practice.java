public class Practice {
    public static int reverseNumber(int num){
        // get the count of digits
        int temp=num;
        int x=0;
        
        while(temp>0){
            x++;
            temp=temp/10;
        }
        
        int c=1;
        int ans=0;
        
        while(num>0){
            int rem=num%10;
            
            int mul=(int)Math.pow(10,x-c);
            
            int mul_result=rem*mul;
            
            ans=ans+mul_result;
            
            // we dont need this digit
            num=num/10;
            c++;
        }
        
        return ans;
    }
    
    // practice module 46th question =============

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn=new Scanner(System.in);
        
        int num=scn.nextInt();
        int count=0;
        
        while(num>0){
            num=num/10;
            count++;
        }
        
        System.out.println(count);
    }
}
