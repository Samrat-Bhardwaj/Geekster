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
    public static Node addFirst(int val, Node head){
        Node nn=new Node(val);

        nn.next=head;
        head=nn;

        return head;
    }

    public static Node removeFirst(Node head){
        Node nbr=head.next;
        head=nbr;

        return head;
    }

    public static Node getTail(Node head){
        Node itr=head;

        while(itr.next!=null){
            // itr=itr.next;
            Node nbr=itr.next;
            itr=nbr;
        }

        return itr;
    }

    public static void addLast(int val, Node head){
        Node tail=getTail(head);

        Node nn=new Node(val);
        tail.next=nn;

        tail=nn;
    }

    public static Node getAt(Node head, int idx){
        Node itr=head;

        for(int i=0; i<idx; i++){
            Node nbr=itr.next;
            itr=nbr;
        }

        return itr;
    }

    public static Node addAt(Node head, int idx, int val){
        if(idx==0){
            return addFirst(val, head);
        }

        Node prev=head;
        for(int i=0; i<(idx-1); i++){
            Node nbr=prev.next;
            prev=nbr;
        }

        Node prev_ka_next=prev.next;

        Node nn=new Node(val);

        prev.next=nn;
        nn.next=prev_ka_next;

        return head;
    }

    public static Node removeAt(Node head, int idx){
        if(idx==0){
            return removeFirst(head);
        }

        Node node_ka_prev=head;

        for(int i=0; i<(idx-1); i++){
            Node nbr=node_ka_prev.next;
            node_ka_prev=nbr;
        }

        Node node=node_ka_prev.next;

        Node node_ka_next=node.next;

        node_ka_prev.next=node_ka_next;

        return head;
    }

    public static void printLinkedList(Node head){
        System.out.println("Printing linked list");
        Node itr=head;

        while(itr!=null){
            System.out.print(itr.data+" ");

            Node nbr=itr.next;
            itr=nbr;
        }

        System.out.println();
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
        // System.out.println();
        // System.out.println("adding val 5 at head");

        // head=addFirst(5, head);

        // System.out.println("adding val 47 at last");

        // addLast(47, head);
        // printLinkedList(head);
        // System.out.println();

        // Node n3=getAt(head, 3);
        // System.out.println(n3.data);

        head=addAt(head, 2, 47);
        printLinkedList(head);

        head=removeAt(head, 2);
        printLinkedList(head);
    }
}
