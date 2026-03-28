class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class Linked_List {
    Node head;
    Node tail;
    int size;
    Linked_List(){
        this.head=null;
        this.tail=null;
    }
        void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null){
            head=temp;
            tail=temp;
        }  
        else{
            tail.next=temp;
            tail=temp;
        } 
        size++;
    }

        void addAthead(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }  
        else{
            temp.next=head;
            head=temp;
            }
            size++;
        }

        void deleteAthead(){
            if(head==null) return;
            head=head.next;
            if(head==null){
                tail=null;
            }
            size--;
        }

        void display(){
            if(head==null) return;
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
}

boolean search(int val){
    Node temp=head;
    int idx=0;
    while(temp!=null){
        if(temp.val==val){
            return true;
        }
        temp=temp.next;
        idx=idx+1;
    }
    return false;
}

void InsertAtIdx(int i, int val) {

    Node temp = new Node(val);

    // Insert at head
    if (i == 0) {
        temp.next = head;
        head = temp;
        if (tail == null) {
            tail = temp;
        }
        return;
    }

    Node t = head;
    int idx = 0;

    // Stop at (i-1)th node
    while (idx < i - 1) {
        if (t == null) {
            System.out.println("Index out of bounds");
            return;
        }
        t = t.next;
        idx++;
    }

    temp.next = t.next;
    t.next = temp;

    // Update tail if inserted at end
    if (temp.next == null) {
        tail = temp;
    }
    size++;
}

void deleteAtIdx(int i){
    int idx=0;
    Node temp=head;
    Node prev=head;

    if (i == 0) {
        head=temp.next;
    }
    while(idx<=i-1){
        prev=temp;
        temp=temp.next;
        idx=idx+1;
    }
       prev.next=temp.next;
       size--;
       return;
}
}


public class Linkedlist_DS{
    public static void main(String[] args){
    Linked_List l1=new Linked_List();
    l1.addAtTail(10);
    l1.addAtTail(20);
    l1.addAtTail(30);
    l1.addAtTail(40);
    l1.addAtTail(50);
    l1.addAthead(60);
    l1.deleteAtIdx(2);
    l1.deleteAtIdx(3);
    l1.addAthead(100);
    l1.display();
    System.out.println("Size of linked list is: "+l1.size);
    // boolean b=l1.search(100);
    // System.out.println(b);
}
}

