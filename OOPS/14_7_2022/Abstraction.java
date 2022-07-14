abstract class Vechile {
    String color;
    // abstract method
    public abstract void Honk();

    public void move(){
        System.out.println("Okay moving!");
    }
}

class Car extends Vechile {
    public void Honk(){
        System.out.println("Pee poow");
    }
}

class Bike extends Vechile {
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
