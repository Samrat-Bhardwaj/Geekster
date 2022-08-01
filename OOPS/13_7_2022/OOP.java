class Car {
    String color;
    int model_number;

    public void doNothing(){
        System.out.println("It is doing nothing");
    }
}

class Student {
    private String name="Samrat";
    int roll_num=100;
    int age=25;

    // default constructor 
    public Student(){
        System.out.println("This is constructor 1");
    }

    // parametrized constructors 
    public Student(int new_roll_number, int new_age){
        System.out.println("This is constructor 2");
        roll_num=new_roll_number;
        age=new_age;
    }

    public Student(int new_roll_number){
        System.out.println("This is constructor 3");
        roll_num=new_roll_number;
    }

    // getters 
    public String getName(){
        System.out.println("Name is "+ name);
        return name;
    }

    // setters 
    public void setName(String newName){
        name=newName;
    }

    public void add(int a, int b){
        System.out.println("Result of addition is " + (a+b));
    }
}

public class OOP {
    public static void swapNames(Student s1, Student s2){
        String nameOfS1=s1.getName();
        String nameofS2=s2.getName();

        s1.setName(nameofS2);
        s2.setName(nameOfS1);
    }
    public static void main(String[] args) {
        // className objectName = "new" + "ClassName"+ "()";

        Student s1=new Student(2);
        Student s2=new Student();

        System.out.println(s1);


        s1.setName("ram");
        s2.setName("shyam");

        swapNames(s1,s2);

        System.out.println("After function call =================");
        s1.getName();
        s2.getName();
        // Student s3=new Student(25);

        // s1.getName();
        // s1.setName("ekster");
        // s1.getName();

        // Student s4=new Student(123,15425);

        // Student s5=new Student(123,15425);

        // Student geek=new Student(1200,12);
        


        // System.out.println(" Roll number is "+geek.roll_num+" and age is "+geek.age);

        // geek.add(4,7);
    }
}
