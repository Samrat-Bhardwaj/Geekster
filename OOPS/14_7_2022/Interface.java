interface Vechile {
    public void honk();
    public void move();
}

class Car implements Vechile {
    public void honk(){
        System.out.println("Honking by car");
    }

    public void move(){
        System.out.println("Moving by car");
    }
}

class Bike implements Vechile {
    public void honk(){
        System.out.println("Honking by bike");
    }

    public void move(){
        System.out.println("Moving by bike");
    }
}

public class Interface {
    public static void main(String[] args) {
        Car c1=new Car();
        Bike b1=new Bike();

        c1.honk();
        b1.honk();

        c1.move();
        b1.move();
    }
}
