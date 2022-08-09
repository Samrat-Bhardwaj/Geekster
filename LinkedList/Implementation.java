import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(){

    }

    public Node(int data){
        this.data=data;
    }
}

public class Implementation {
    public static void printLinkedList(Node head){
        
    }
    
    public static void main(String[] args) {
        // Node head=new Node(5);

        // Node n1=new Node(45);

        // head.next=n1;

        // Node n2=new Node(7);
        // n1.next=n2;

        // Node nextOfHead=head.next;
        // System.out.println(n1+" fggfg "+nextOfHead);
        // System.out.println(nextOfHead.data);

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number of inputs ");
        int n=scn.nextInt();

        Node head=null;
        Node itr=null;
        for(int i=0; i<n; i++){
            int data=scn.nextInt();

            if(i==0){
                head=new Node(data);
            } else if(i==1){
                itr=new Node(data);
                head.next=itr;
            } else {
                Node n1=new Node(data);
                itr.next=n1;
                itr=itr.next;
            }
        }

        printLinkedList(head);
    }
}
