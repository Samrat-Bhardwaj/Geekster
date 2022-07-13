class Car {
    String color;
    int model_number;

    public void doNothing(){
        System.out.println("It is doing nothing");
    }
}

public class OOP {
    public static void main(String[] args) {
        // className objectName = "new" + "ClassName"+ "()";
        Car c1 = new Car();

        c1.color = "Blue";
        c1.model_number = 12334;


        System.out.println(c1.color);
        System.out.println(c1.model_number);

        c1.doNothing();

        System.out.println(c1);
    }
}
