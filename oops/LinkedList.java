class LL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void insertAtLast(int d){
        Node newN=new Node(d);
        if(head==null){
            head=newN;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newN;

    }

    void removeNthFromEnd(int n){

        Node temp=head;

        if(head==null || head.next==null){
            return;
        }

        int size=0;
        while(temp!=null){
            size=size+1;
            temp=temp.next;
        }
        int prevs=size-n;
        int k=1;
        temp=head;
        while(k<prevs){
            temp=temp.next;
            k++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        Node prev=temp;
        prev.next=prev.next.next;
    }


    void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }

}
public class LinkedList{
    public static void main(String[] args){
        LL n=new LL();
        n.insertAtLast(10);
        n.insertAtLast(100);
        n.insertAtLast(90);
        n.insertAtLast(80);
        n.insertAtLast(200);
        n.insertAtLast(200);
        n.removeNthFromEnd(6);
        n.display();
    }
}

