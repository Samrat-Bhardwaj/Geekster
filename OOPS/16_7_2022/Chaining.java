class Student { // constructor chaining within the same class 
    String name;
    int roll_number;
    int age;
    int marks;

    public Student(String name, int roll_number){
        this.name=name;
        this.roll_number=roll_number;
    }

    public Student(String name, int roll_number, int age){
        this(name, roll_number);
        this.age=age;
    }

    public Student(String name, int roll_number, int age, int marks){
        this(name, roll_number,age);

        this.marks=marks;
    }
}

// constructor chaining from other class 
class Vechile {
    String color;
    int model_number;

    public Vechile(String color, int model_number){
        this.color = color;
        this.model_number = model_number;
    }
}

class Bike extends Vechile {
    int milege;

    public Bike(String color, int model_number, int milege){
        super(color,model_number);
        this.milege=milege;
    }    
}

public class Chaining {
    public static void main(String[] args) {
        Student s1 = new Student("John",12,23);

        System.out.println("name is "+s1.name+" and roll number is "+s1.roll_number+" and age is "+s1.age);

        Bike b=new Bike("blue",123,50);

        System.out.println(b.color);
    }
}
