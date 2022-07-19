class Vechile {
    final int top_speed;
    String color;
    int model_number;

    public Vechile(){
        top_speed=150;
    }

    final public void fun(){

        System.out.println("This is fun");
    }
}

class Car extends Vechile {
    int top_speed=200;
}

public class Example {
    public static void main(String[] args) {
        Vechile v=new Vechile();
        

        System.out.println(v.top_speed);
    }
}
