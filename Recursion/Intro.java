public class Intro {
    public static void printIncreasing(int x){
        if(x==1){
            System.out.println(x);
            return;
        }

        printIncreasing(x-1);
        System.out.println(x);
    }

    public static void printDecreasing(int x){
        if(x==1){
            System.out.println(x);
            return;
        }

        System.out.println(x);
        printDecreasing(x-1);
    }

    public static void printDecreasingIncreasing(int x){
        if(x==1){
            System.out.println(x);
            return;
        } 
        
        System.out.println(x);
        printDecreasingIncreasing(x-1);
        System.out.println(x);
    }

    public static void main(String[] args) {
        // printIncreasing(7);

        // System.out.println("===========================");

        // printDecreasing(7);    

        printDecreasingIncreasing(5);
    }    
}
