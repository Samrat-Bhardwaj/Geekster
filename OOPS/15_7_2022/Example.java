class Vechile {
    String color; 
    int vid;  
    int model_number; 

    public void Honk(){
        System.out.println("Pee poow!!");
    }

    public Vechile(String color, int vid, int model_number){
        this.color=color;
        this.vid=vid;
        this.model_number=model_number;
    }

    public void printA(){
        System.out.println("Printing A");

        String color="Geekster";

        System.out.println("hi i am local color "+color);
        System.out.println("hi i am this "+this.color);
    }
}

public class Example {
    public static void main(String[] args) {
        Vechile v=new Vechile("Red", 124, 800);

        System.out.println(v.color);
        System.out.println(v.vid);
        System.out.println(v.model_number);
        
        v.printA();        
    }
}
