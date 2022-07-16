class Car {
    String color;
    static int count=0; // this will be initialised in memory only once

    public Car(){
        count=count+1;
    }

    public static void fun(){
        count= 2323;
        System.out.println("This is a static function");
    }

    public static int sum(int a, int b){
        return a+b;
    }
}

public class Static {
    public static void main(String[] args) {
        int sum = Car.sum(2,4);

        System.out.println(sum);
        System.out.println("The count of car objects is " + Car.count);
    }
}
