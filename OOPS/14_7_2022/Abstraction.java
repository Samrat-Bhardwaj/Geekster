abstract class Vechile {
    String color;
    // abstract method
    public abstract void Honk();

    public void move(){
        System.out.println("Okay moving!");
    }
}

interface Salman {
    public void move();
    public void dontMove();
}

interface Shahrukh {
    public void Rock();
}


class Car implements Salman, Shahrukh {
    public void move(){
        System.out.println("Okay moving!");
    }

    public void dontMove(){
        System.out.println("Okay moving!");
    }

    public void Rock(){
        System.out.println("Okay moving!");
    }
}

class Bike implements Salman {
    public void Honk(){
        System.out.println("Pee poow by bike");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.Honk();

        Bike b1=new Bike();
        b1.Honk();
        b1.move();
    }
}
