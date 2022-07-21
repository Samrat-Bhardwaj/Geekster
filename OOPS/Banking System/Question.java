import java.util.ArrayList;
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
        Person p=null;

        for(int i=0; i<accounts.size(); i++){
            Person curPerson = accounts.get(i);

            if(curPerson.name.equals(entered_name) && curPerson.account_no == entered_account_no ){
                p=curPerson;
                break;
            }
        }

        if(p==null){
            System.out.println("There is no account with name "+entered_name+" and account number "+entered_account_no);
            return;
        }

        withdrawCash(p, entered_PIN, amount);
    }

    public void depositCash(){

    }

    public void getBalance(){

    }

    public void changePin(){

    }
}

public class Question {
    public static void main(String[] args) {
        ATM Bank=new ATM();

        Person p1=new Person("A", 1, 1000, 1234);
        Bank.accounts.add(p1);

        Person p2=new Person("B", 2, 900, 1233);
        Bank.accounts.add(p2);
        // register with ATM        

        Bank.withdrawCash(p1, 1234, 200);
        Bank.withdrawCash(p2, 1233, 100);

        Bank.withdrawCash("B",2, 1233, 2000);
    }
}
