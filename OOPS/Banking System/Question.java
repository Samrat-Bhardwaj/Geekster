import java.util.*;

class Person {
    String name;
    int account_no;
    int balance;
    int PIN;

    public Person(String name, int account_no, int balance, int PIN){
        this.name=name;
        this.account_no=account_no;
        this.balance=balance;
        this.PIN=PIN;
    }
}

class ATM {
    ArrayList<Person> accounts;

    public ATM (){
        accounts=new ArrayList<>();
    }

    private Person getPerson(String entered_name, int entered_account_no){
        Person p=null;

        for(int i=0; i<accounts.size(); i++){
            Person curPerson = accounts.get(i);

            if(curPerson.name.equals(entered_name) && curPerson.account_no == entered_account_no ){
                p=curPerson;
                break;
            }
        }

        return p;
    }

    public void withdrawCash(Person p, int entered_PIN, int amount){
        if(p.PIN == entered_PIN){
            if(p.balance < amount){
                System.out.println(amount + " is not available in your account, curr balance is "+p.balance);
            } else {
                p.balance=p.balance-amount;
                System.out.println("Amount received "+amount +" updated balance is "+p.balance);
            }
        } else {
            System.out.println("Wrong PIN");
        }
    }

    public void withdrawCash(String entered_name, int entered_account_no, int entered_PIN, int amount){
        Person p=getPerson(entered_name, entered_account_no);

        if(p==null){
            System.out.println("There is no acccount with name "+entered_name+" and account number "+entered_account_no);
            return;
        }

        withdrawCash(p, entered_PIN, amount);
    }

    public void depositCash(Person p, int amount){
        p.balance = p.balance + amount;
        System.out.println("New balance is "+p.balance);
    }

    public void depositCash(String entered_name, int entered_account_no, int amount){
       Person p=getPerson(entered_name, entered_account_no);

        if(p==null){
            System.out.println("There is no acccount with name "+entered_name+" and account number "+entered_account_no);
            return;
        }
        
        depositCash(p, amount);
    }

    public void getBalance(Person p, int entered_PIN){
        if(p.PIN == entered_PIN){
            System.out.println("The balance is "+p.balance);
        } else {
            System.out.println("Entered pin is wrong!");
        }
    }

    public void getBalance(String entered_name, int entered_account_no, int entered_PIN){
        Person p=getPerson(entered_name, entered_account_no);

        if(p==null){
            System.out.println("There is no acccount with name "+entered_name+" and account number "+entered_account_no);
            return;
        }

        getBalance(p, entered_PIN);
    }


    public void changePin(Person p, int old_PIN, int new_PIN){
        if(p.PIN == old_PIN){
            System.out.println("The PIN is changed");
            p.PIN = new_PIN;
        } else {
            System.out.println("Entered old pin is wrong!");
        }
    }
}

public class Question {
    public static void main(String[] args) {
        ATM Bank=new ATM();

        Scanner scn=new Scanner(System.in);
        Person p1=new Person("A", 1, 1000, 1234);
        Bank.accounts.add(p1);

        Person p2=new Person("B", 2, 900, 1233);
        Bank.accounts.add(p2);
               

        Bank.withdrawCash(p1, 1234, 200);
        Bank.withdrawCash(p2, 1233, 100);

        Bank.withdrawCash("B",2, 1233, 2000);

        Bank.depositCash(p1, 10000);
        Bank.depositCash("B", 2,20);

        Bank.getBalance(p1, 1234);
        Bank.getBalance(p1, 1233);

        Bank.getBalance("B", 2, 1233);

        Bank.changePin(p1, 1234, 2552);

        Bank.withdrawCash(p1, 1234, 500);
    }
}
