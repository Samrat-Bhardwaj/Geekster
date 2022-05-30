public class Break {
    public static void main(String[] args) {
    // break statement ================================================ 
        for(int i=1; i<=10; i++){
            if(i==7){
                break;
            }

            System.out.println(i);
        }

    // continue statement ================================================ 

    System.out.println("Continue");

        for(int i=1; i<=10; i++){
            System.out.println(i);

            if(i==7){
                continue;
            }
            // these lines will be skipped (continued)
            System.out.println("geek "+i);
            System.out.println("i is not equal to 7");
        }

    }
}
