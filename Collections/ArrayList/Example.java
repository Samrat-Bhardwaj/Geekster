import java.util.*;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();

        for(int val=1; val<=10; val++){
            al.add(val);  // value

            System.out.println("After adding "+ val+" the size of my arraylist is "+ al.size());
        }

        for(int i=0; i<al.size(); i++){
            int val=al.get(i); // index 

            System.out.println(val+" is at index "+i);
        }

        al.set(3,45);

        System.out.println("after setting index");

        for(int i=0; i<al.size(); i++){
            int val=al.get(i); // index 

            System.out.print(val+" ");
        }

        al.remove(3);

        for(int i=0; i<al.size(); i++){
            int val=al.get(i); // index 

            System.out.println(val+" is at index "+i);
        }
        
        al.set(3,45);

        for(int i=0; i<al.size(); i++){
            int val=al.get(i); // index 

            System.out.println(val+" is at index "+i);
        }
    }
}
