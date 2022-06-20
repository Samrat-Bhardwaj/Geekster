public class Strings {
    public static void main(String[] args) {
        String a="Java";
        

        String b=a;

        a=a+"DSA";

        // System.out.println(a);
        // System.out.println(b);

        a="Java";
        b="Java";

        String c=new String("Java");

        if(a==b){
            System.out.println("a is equal to b");
        }

        if(a==c){
            System.out.println("a is equal to c");
        }

        if(a.equals(c)){
            System.out.println("a is equal to c part 2");
        }

        String g="geekster";

        for(int i=0; i<g.length(); i++){
            char ch=g.charAt(i);

            System.out.println("character at position "+i+" is: "+ch);
        }
    }
}
