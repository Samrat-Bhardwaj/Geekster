class Bank {
    public double getIntrestRate(){
        return 0.0;
    }
}

class Kotak extends Bank {
    public double getIntrestRate(){
        return 1.5;
    }
}

class SBI extends Bank {
    @Override
    public double getIntrestRate(){
        return 3.5;
    }
}

class HDFC extends Bank {
    public double getIntrestRate(){
        return 0.5;
    }
}

public class RunPoly {
    public static void main(String[] args) {
        // upcasting 
        Bank obj;
        
        obj=new Kotak();
        System.out.println(obj.getIntrestRate());

        obj=new SBI();
        System.out.println(obj.getIntrestRate());

        obj=new HDFC();
        System.out.println(obj.getIntrestRate());

        boolean f= obj instanceof SBI;
        System.out.println(f);
    }
}
