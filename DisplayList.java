import java.util.Scanner;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
}


public class DisplayList {

         public static void displayRecurssion(Node head){
    
        if(head==null) return;
         System.out.println(head.val);
            displayRecurssion(head.next);
        }

        public static void displayRecurssionREV(Node head){
    
        if(head==null) return;
        displayRecurssion(head.next);
         System.out.println(head.val);
        }

        // public static void displayRecurssion(Node head){
        //     Node temp=head;
        //     System.out.println(temp.val);
        // while(temp!=null)
        //     displayRecurssion(temp.next);
        // }
       

        public static void getIdx(Node head, int idx){
            int i=1;
            Node temp=head;
            while(i<=idx){
            temp=temp.next;
            i=i+1;
            }
            System.out.println(temp.val);
        }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
    }

  public static Node addNodeEnd(Node head, Node t) {
    if (head == null) {
        return t;
    }

    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    temp.next = t;
    return head;
}

public static Node addNodeHead(Node head, Node h) {
    if (head == null) {
        return h;
    }
    else{
        h.next = head;  
        head=h;
        return head;
    }
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node a=new Node(10); //a.val=10;
        Node b=new Node(20);
        Node o=new Node(800);  //b.val=20;
        Node c=new Node(30); //c.val=30;
        Node d=new Node(40); //d.val=40;
        Node e=new Node(50);
        Node f=new Node(80); 
        Node tail=new Node(sc.nextInt());
        Node h=new Node(sc.nextInt());
        // System.out.println(e.val);

        a.next=b;
        b.next=o;
        o.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        //represents same thing
        // System.out.println(c);
        // System.out.println(b.next);
        // System.out.println(a.next.next);
        // display(c);

        // displayRecurssion(a);
        // displayRecurssionREV(a);
        // getIdx(a,4);
        addNodeEnd(a,tail);
        // display(a);
        addNodeHead(a,h);
        display(b);
        sc.close();
    }
}