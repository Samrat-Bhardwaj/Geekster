public class Questions {
    public static int fact(int n){
        if(n==0){
            return 1;
        }

        int f=fact(n-1);
        int ans=n*f;

        return ans;
    }

    public static int power(int a, int b){
        if(b==0){
            return 1;
        }

        int f=power(a, b-1);

        int ans=a*f;
        return ans;
    }

    public static int power_better(int a, int b){
        if(b==0){
            return 1;
        }

        int f=power(a,b/2);

        int ans=f*f;

        if(b%2==1){
            ans=a*ans;
        }

        return ans;
    }

    // recursion of the way up
    public static void print_array(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }

        System.out.println(arr[idx]);
        print_array(arr, idx+1);
    }

    // recursion on the way down
    public static void print_array_reverse(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }

        print_array_reverse(arr, idx+1);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        // System.out.println(fact(5));
        // System.out.println(power(2,4));

        // System.out.println(power_better(2,7));

        int[] arr={10,29,11,5,43};

        print_array(arr, 0);

        print_array_reverse(arr, 0);
    }    
}
