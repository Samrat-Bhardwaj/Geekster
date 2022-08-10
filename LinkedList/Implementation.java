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
    public static void addFirst(int val, Node head){
        Node nn=new Node(val);

        nn.next=head;
        head=nn;

        printLinkedList(head);
    }

    public static void printLinkedList(Node head){
        System.out.println("Printing linked list");
        Node itr=head;

        while(itr!=null){
            System.out.print(itr.data+" ");

            Node nbr=itr.next;
            itr=nbr;
        }
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

        int first_ele=scn.nextInt();

        Node head=new Node(first_ele);
        Node itr=head;

        for(int i=1; i<n; i++){
            int data=scn.nextInt();

            Node n1=new Node(data);
            itr.next=n1;

            Node nbr=itr.next;
            itr=nbr;
        }

        printLinkedList(head);

        System.out.println("adding val 5 at head");

        addFirst(5, head);
    }
}
