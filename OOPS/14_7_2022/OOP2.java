class Vechile {
    String color="Violet";

    public void honk(){
        System.out.println("Pee poow!!");
    }
}

// inheritance 
class Car extends Vechile {
    int model_number;

    public Car(){
        color = "red";
    }
}

class Bike extends Vechile {
    int bike_number;

    public Bike(){
        color="blue";
    }
}

public class OOP2 {
    public static void main(String[] args) {
        Car c1=new Car();
        // c1.honk();

        Vechile v=new Vechile();
        // v.honk();

        Bike b1=new Bike();
        // b1.honk();

        System.out.println(c1.color);
        System.out.println(b1.color);
        System.out.println(v.color);
    }
}
