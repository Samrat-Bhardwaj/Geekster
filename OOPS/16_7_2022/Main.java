class Student {
    String name;
    int age;
    int roll_number;
    static String school_name; // school name will always be the same irrespective of the object 
}

public class Main {
    public static void main(String[] args) {
        Student s1=new Student();

        s1.name="Geek";
        s1.age=22;
        s1.roll_number=123;
        s1.school_name="DPS";

        Student s2=new Student();
        s2.name="Ster";
        s2.roll_number=124;
        s2.school_name="EPS";

        Student s3=new Student();
        s3.school_name="DPS";

        Student s4=new Student();
        s4.school_name="1PS";

        Student.school_name="Abcd";


        System.out.println(s1.school_name);
        System.out.println(s2.school_name);
    }
}
