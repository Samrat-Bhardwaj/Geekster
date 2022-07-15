class Parent {
    int id;
    String color;

    public Parent(){
        System.out.println("this is parent constructor");
    }

    public void doParenting(){
        System.out.println("Doing!!!!");
    }
}

class Child extends Parent {
    int child_id;

    public Child(){
        System.out.println("This is child constructor");
    }

    public void doChildLikeActivities(){
        System.out.println("Throwing objects");
    }
}

class GrandChild extends Child {
    int g_id;

    public GrandChild(){
        System.out.println("This is granchild constructor");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        // GrandChild gc=new GrandChild();

        Child c=new Child();
        
    }
}
