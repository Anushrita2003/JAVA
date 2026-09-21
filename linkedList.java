public class linkedlist {
    public static class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
    }

    //Displaying Recursively
    public static void displayRecur(Node head){
        
        if(head==null) return;
        
        System.out.print(head.val+" ");
        displayRecur(head.next);
        
    }


    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
        System.out.println(temp.val);
        temp=temp.next;
        }
    }

    public static void main(String[] args){

        Node a=new Node(10); //a.val=10;
        Node b=new Node(20); //b.val=20;
        Node c=new Node(30); //c.val=30;
        Node d=new Node(40); //d.val=40;
        Node e=new Node(50); //e.val=50;

        // System.out.println(e.val);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

    //represents same thing

    //    Node temp=a;
    //    for(int i=0;i<=5;i++){
    //     System.out.println(temp.val);
    //     temp=temp.next;
    //    }

    display(a);
    displayRecur(a);

    }
} 
