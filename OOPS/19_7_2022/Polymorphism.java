class Vechile {
    String color;
    int model_number;

    public void Honk(){
        System.out.println("Pee poww!!!");
    }
    // method overloading 
    public void Honk(int i){
        System.out.println("Peee poww!! " + i);
    }

    public void Honk(String s){
        System.out.println("Peee poww!! with a string "+s);
    }

    public void Honk(String s, String p){
        System.out.println("Pee poww!! with strings "+s+" and "+p);
    }
}
// parent class 
class Animal {
    String color;
    int legs;

    public void walk(){
        System.out.println("Okay walking!!!");
    }
}

// sub class / child class
class Dog extends Animal {
    double abc;

    public void walk(){ // overridden method 
        System.out.println("Okay walking with a dog!!!!");
    }
}

class Cat extends Animal {
    public void walk(){
        System.out.println("Okay walking with a cat");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Vechile v=new Vechile();

        // v.Honk();
        // v.Honk(34);
        // v.Honk("Geekster");
        // v.Honk("Geek","java");

        // upcasting 
        Animal obj=new Dog();
        obj.walk(); // resolved at runtime , dynamic binding, late binding, method override 

        obj=new Cat();
        obj.walk();
    }
}
